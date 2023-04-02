package kr.co.kchpetclinicstudy.service.service;

import kr.co.kchpetclinicstudy.persistence.entity.Owners;
import kr.co.kchpetclinicstudy.service.service.dto.OwnersDTO;

public interface OwnersService {
    void createOwner(OwnersDTO ownersDto); // crud c
    OwnersDTO readOwner(OwnersDTO ownersDTO); // crud r
    void updateOwner(OwnersDTO ownersDTO); // crud u
    void deleteOwner(OwnersDTO ownersDTO); // crud d
    default Owners dtoToEntity(OwnersDTO ownersDTO) { //db에 저장하기 위해서 dto -> entity
        Owners entity = Owners.builder()
                .firstName(ownersDTO.getFirstName())
                .lastName(ownersDTO.getLastName())
                .city(ownersDTO.getCity())
                .address(ownersDTO.getAddress())
                .telephone(ownersDTO.getTelephone())
                .build();
        return entity;
    };

    default OwnersDTO entityToDto(Owners owners) { //db에서 읽어와서 entity -> dto
        OwnersDTO ownersDto = OwnersDTO.builder()
                .firstName(owners.getFirstName())
                .lastName(owners.getLastName())
                .city(owners.getCity())
                .address(owners.getAddress())
                .telephone(owners.getTelephone())
                .build();
        return ownersDto;
    }
}
