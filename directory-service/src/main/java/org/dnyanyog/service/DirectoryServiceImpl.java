package org.dnyanyog.service;

import java.util.Optional;

import org.dnyanyog.dto.DirectoryServiceRequest;
import org.dnyanyog.dto.DirectoryServiceResponse;
import org.dnyanyog.encrypt.EncryptionUtils;
import org.dnyanyog.entity.Directory;

import org.dnyanyog.enumm.ResponseCode;
import org.dnyanyog.repo.DirectoryServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectoryServiceImpl {

  @Autowired DirectoryServiceRepository userRepo;

@Autowired DirectoryServiceResponse response;
  @Autowired EncryptionUtils encrypt;

  public DirectoryServiceResponse addUser(DirectoryServiceRequest request) throws Exception {
DirectoryServiceResponse response=DirectoryServiceResponse.getInstance();
    Directory UsersTable = new Directory();
    UsersTable.setConfirm(request.getConfirm());
    UsersTable.setMobno(request.getMobno());
    UsersTable.setEmail(request.getEmail());
    UsersTable.setPassword(encrypt.encrypt(request.getPassword()));
    UsersTable.setUsername(request.getUsername());
    UsersTable.setRole(request.getRole());
    UsersTable.setUserid(request.getUserid());
    try {
      UsersTable = userRepo.save(UsersTable);

      response.setMobno(UsersTable.getMobno());
      response.setRole(UsersTable.getRole());
      response.setPassword(UsersTable.getPassword());
      response.setConfirm(UsersTable.getConfirm());
      response.setEmail(UsersTable.getEmail());
      response.setUserid(UsersTable.getUserid());

      response.setMessage(ResponseCode.Add_User_Success.getMessage());
      response.setStatus(ResponseCode.Add_User_Success.getStatus());

    } catch (Exception e) {
      response.setStatus(ResponseCode.Add_User_Fail.getStatus());
      response.setMessage(ResponseCode.Add_User_Fail.getMessage());
    }
    return response;
  }

  public DirectoryServiceResponse updateUser(Long userid, DirectoryServiceRequest request) {
	  DirectoryServiceResponse response=DirectoryServiceResponse.getInstance();
    Optional<Directory> receiveData = userRepo.findById(userid);
    if (receiveData.isEmpty()) {
      response.setMessage(ResponseCode.Update_User_Fail.getMessage());
      response.setStatus(ResponseCode.Update_User_Fail.getStatus());
      response.setUserid(userid);
    } else {
      Directory user = receiveData.get();
      response.setMessage(ResponseCode.Update_User_Success.getMessage());
      response.setStatus(ResponseCode.Update_User_Success.getStatus());
      response.setMobno( user .getMobno());
      response.setRole( user .getRole());
      response.setPassword( user .getPassword());
      response.setConfirm( user .getConfirm());
      response.setEmail( user .getEmail());
      response.setUserid(user.getUserid());
    }

    return response;
  }

  public DirectoryServiceResponse getSingleUser(Long userid) {
	  DirectoryServiceResponse response=DirectoryServiceResponse.getInstance();
    Optional<Directory> receiveData = userRepo.findById(userid);
    if (receiveData.isEmpty()) {
      response.setMessage(ResponseCode.Check_User_Fail.getMessage());
      response.setStatus(ResponseCode.Check_User_Fail.getStatus());
      response.setUserid(userid);
    } else {
      Directory user = receiveData.get();
      response.setMessage(ResponseCode.Check_User_Success.getMessage());
      response.setStatus(ResponseCode.Check_User_Success.getStatus());
      response.setUsername(user.getUsername());
      response.setEmail(user.getEmail());
      response.setMobno(user.getMobno());
      response.setRole(user.getRole());
      response.setPassword(user.getPassword());
      response.setConfirm(user.getConfirm());
    }
    return response;
  }

  public DirectoryServiceResponse Deleteuser(Long userid) {
	  DirectoryServiceResponse response=DirectoryServiceResponse.getInstance();
    Optional<Directory> receiveData = userRepo.findById(userid);
    if (receiveData.isPresent()) {
      userRepo.deleteById(userid);
      response.setMessage(ResponseCode.Delete_User_Success.getMessage());
      response.setStatus(ResponseCode.Delete_User_Success.getStatus());
      response.setUserid(userid);
    }
    response.setMessage(ResponseCode.Delete_User_Fail.getMessage());
    response.setStatus(ResponseCode.Delete_User_Fail.getStatus());
    response.setUserid(userid);

    return response;
  }
}
