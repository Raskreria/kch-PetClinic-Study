package kr.co.kchpetclinicstudy.controller;

import kr.co.kchpetclinicstudy.persistence.entity.Owners;
import kr.co.kchpetclinicstudy.service.model.request.OwnerJoinRequest;
import kr.co.kchpetclinicstudy.service.service.OwnersService;
import kr.co.kchpetclinicstudy.service.service.dto.OwnersDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;

@RestController
@RequestMapping("/api/v1/owners")
@RequiredArgsConstructor
@Log4j2
public class OwnersController {
    private final OwnersService ownersService;
    @GetMapping("/join")
    public ResponseEntity<Owners> joinOwner(@RequestBody OwnerJoinRequest request){
        ownersService.createOwner(new OwnersDTO()); // request로 수정?

        return ResponseEntity.ok().build();
    }

    @PostMapping("/search")
    public ResponseEntity<Owners> searchOwner(@PathVariable Long ownerId){

        Owners owner = ownersService.readOwner(ownerId);
        HttpHeaders header = new HttpHeaders();
        header.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        return ResponseEntity.ok(owner);
    }

    @PatchMapping ("/change")
    public ResponseEntity<Owners> change(){

    }

    @DeleteMapping("/withdraw")
    public ResponseEntity<Owners> withdraw(){

    }
}
