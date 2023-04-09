package kr.co.kchpetclinicstudy.service.service;

import kr.co.kchpetclinicstudy.persistence.entity.Owner;
import kr.co.kchpetclinicstudy.persistence.repository.OwnerRepository;
import kr.co.kchpetclinicstudy.service.model.dtos.request.OwnerReqDTO;
import kr.co.kchpetclinicstudy.service.model.dtos.response.OwnerResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerServiceimpl implements OwnerService {

    private final OwnerRepository ownerRepository;


    public void createOwner(OwnerReqDTO.Create create){
        ownerRepository.save(Owner.dtoToEntity(create));
    }


    @Override
    public OwnerResDTO.Read readOwnerById(Long ownerId){
        Owner owner = ownerRepository.findById(ownerId).orElseThrow();
        OwnerResDTO.Read read = Owner.entityToDto(owner);
        return read;
    }

    @Override
    public void updateOwner(OwnerReqDTO.Update update) {
        Owner owner = ownerRepository.findById(update.getOwnerId()).get();
        owner.updateOwner(update);
    }

    @Override
    public void deleteOwner(Long ownerId) {
        final Owner owner = ownerRepository.findById(ownerId).get();
        ownerRepository.delete(owner);
    }


}
