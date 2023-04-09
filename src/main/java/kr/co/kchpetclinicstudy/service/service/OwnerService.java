package kr.co.kchpetclinicstudy.service.service;

import kr.co.kchpetclinicstudy.service.model.dtos.request.OwnerReqDTO;
import kr.co.kchpetclinicstudy.service.model.dtos.response.OwnerResDTO;

public interface OwnerService {
    void createOwner(OwnerReqDTO.Create create); // crud c
    OwnerResDTO.Read readOwnerById(Long ownerId); // crud r
    void updateOwner(OwnerReqDTO.Update ownerDTO); // crud u
    void deleteOwner(Long ownerId); // crud d


}
