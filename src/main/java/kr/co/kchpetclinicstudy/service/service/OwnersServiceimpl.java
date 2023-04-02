package kr.co.kchpetclinicstudy.service.service;

import kr.co.kchpetclinicstudy.persistence.entity.Owners;
import kr.co.kchpetclinicstudy.persistence.repository.OwnersRepository;
import kr.co.kchpetclinicstudy.service.service.dto.OwnersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnersServiceimpl implements OwnersService{
    @Autowired
    OwnersRepository ownersRepository;
    public void createOwner(OwnersDTO ownersDTO){
        Owners o = dtoToEntity(ownersDTO);
        ownersRepository.save(o);
    }

    public OwnersDTO readOwner(OwnersDTO ownersDTO){
        Long ownerId = ownersDTO.getOwnerId();
        Optional<Owners> result = ownersRepository.findById(ownerId);
        if(result.isPresent()){
            return entityToDto(result.get()); // optional이라 get으로 owners타입으로 벗김.
        }
        return null;
    }

    @Override
    public void updateOwner(OwnersDTO ownersDTO) {

    }

    @Override
    public void deleteOwner(OwnersDTO ownersDTO) {

    }
}
