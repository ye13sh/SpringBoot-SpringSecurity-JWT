package com.PVR.CONTROLLER;

import com.PVR.DTO.AuthDTO;
import com.PVR.DTO.pvrDTO;
import com.PVR.DTO.userDTO;
import com.PVR.SERVICE.jwtService;
import com.PVR.SERVICE.pvrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class pvrController {
    @Autowired
    private pvrService pService;
    @Autowired
    private jwtService jservice;
    @Autowired
    private AuthenticationManager manager;

    @PostMapping("/BookingTicket")
    public ResponseEntity<pvrDTO> InsertTicket(@RequestBody pvrDTO pDTO){
        return ResponseEntity.ok(pService.InsertTicket(pDTO));
    }
    @GetMapping("/GetTicket")
    public ResponseEntity<pvrDTO> GetTicketByID(@RequestParam("id") int id){
        return ResponseEntity.ok(pService.GetTicketByID(id));
    }
    @PutMapping("/UpdateTicket")
    public ResponseEntity<pvrDTO> UpdateTicketByID(@RequestParam("id") int id){
        return ResponseEntity.ok(pService.UpdateTicketByID(id));
    }
    @DeleteMapping("/DeleteTicket")
    public ResponseEntity<pvrDTO> DeleteTicketByID(@RequestParam("id") int id){
        return ResponseEntity.ok(pService.DeleteTicketByID(id));
    }
    @PostMapping("/new")
    public ResponseEntity<userDTO> addUser(@RequestBody userDTO udto){
        return ResponseEntity.ok(pService.addUser(udto));
    }

    @RequestMapping("/authenticate")
    public String authenticate(@RequestBody AuthDTO authDTO){
        Authentication authentication= manager.authenticate(new UsernamePasswordAuthenticationToken(authDTO.getUsername(),authDTO.getPassword()));
        if (authentication.isAuthenticated()){
            return jservice.generateToken(authDTO.getUsername());
        }else{
            throw new UsernameNotFoundException("Username Not found");
        }

    }
}
