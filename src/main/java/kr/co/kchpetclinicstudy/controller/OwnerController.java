package kr.co.kchpetclinicstudy.controller;

import kr.co.kchpetclinicstudy.service.model.dtos.request.OwnerReqDTO;
import kr.co.kchpetclinicstudy.service.model.dtos.response.OwnerResDTO;
import kr.co.kchpetclinicstudy.service.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/owners")
@RequiredArgsConstructor
public class OwnerController {
    private final OwnerService ownerService;

    @GetMapping()
    public ResponseEntity<String> joinOwner(@RequestBody OwnerReqDTO.Create request){
        try {
            ownerService.createOwner(request);
            return ResponseEntity.ok().body("가입성공");
        }catch (Exception e){
            return ResponseEntity.ok().body("가입실패");
        }
    }

    @PostMapping()
    public ResponseEntity<OwnerResDTO.Read> searchOwnerById(@PathVariable(name = "owner_id") Long ownerId){

        OwnerResDTO.Read read = ownerService.readOwnerById(ownerId);

        return ResponseEntity.ok(read);
    }

    @PatchMapping ()
    public ResponseEntity<String> updateOwner(@RequestBody OwnerReqDTO.Update request){
        try {
            ownerService.updateOwner(request);
            return ResponseEntity.ok().body("수정성공");
        }catch (Exception e){
            return ResponseEntity.ok().body("수정실패");
        }
    }
    @DeleteMapping()
    public ResponseEntity<String> deleteOwner(@PathVariable(name = "owner_id") Long ownerId){
        try {
            ownerService.deleteOwner(ownerId);
            return ResponseEntity.ok().body("삭제성공");
        }catch (Exception e){
            return ResponseEntity.ok().body("삭제실패");
        }
    }


}
