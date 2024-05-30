
package org.dnyanyog.controller;


import org.dnyanyog.dto.CaseRequest;
import org.dnyanyog.dto.CaseResponse;
import org.dnyanyog.service.CaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaseServiceController {
  @Autowired CaseServiceImpl caseServiceImpl;

  @PostMapping(
      path = "/api/v1/case/add",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public CaseResponse addCase(@RequestBody CaseRequest request) {
    return caseServiceImpl.addCases(request);
  }

  @GetMapping(
      path = "/api/v1/case/{patientId}",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public CaseResponse searchCases(@PathVariable long patientId) {
    return caseServiceImpl.searchCases(patientId);
  }

  @DeleteMapping(
      path = "/api/v1/case/{patientId}",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public String deleteCases(@PathVariable long patientId) {
    return caseServiceImpl.deleteCases(patientId);
  }
}