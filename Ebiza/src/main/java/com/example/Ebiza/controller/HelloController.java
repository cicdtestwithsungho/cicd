package com.example.Ebiza.controller;

import com.example.Ebiza.service.Hello;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class HelloController {
    private String msgTemplate = "%s 님 반갑습니다";
    @GetMapping("/hello")
    public Hello getHelloMsg(@RequestParam(value = "name") String name){
        return new Hello(String.format(msgTemplate, name));
    }
//     뱅크 서비스의 crud 내용. db와 연결되지 않아 주석처리로 저장
//    private final BankService service;
//    @GetMapping("/api/bank/{id}")
//    public Bank findBank(@PathVariable Long id){
//        return service.findBank(id);
//    }
//
//    @GetMapping("/api/banks/name")
//    public Optional<Bank> findBankByName(@RequestParam String bankName) {
//        return service.findByBankName(bankName);
//    }
//
//    @PostMapping("/api/createbank")
//    public Bank InsertBank(@RequestParam String bankName,@RequestParam String bankType,@RequestParam String description){
//        return service.insertBank(bankName, bankType, description);
//    }
//
//    @PutMapping("api/bankUpdate/{id}")
//    public Bank update(@PathVariable Long id,@RequestParam (required = false) String bankName,@RequestParam (required = false) String bankType,@RequestParam (required = false) String description){
//        return service.updateBank(id,bankName, bankType, description);
//    }
//
//    @DeleteMapping("api/bank/{id}")
//    public void delete(@PathVariable Long id){
//        service.deleteBank(id);
//    }
}
