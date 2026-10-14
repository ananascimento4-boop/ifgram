package br.edu.ifpb.ifgram.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")

public class UserController {

    @GetMapping
    public String getUser() {
        return "chamei o endpoint como um GET!";

    }
    @PostMapping
    public String postUser(){
        return "chamei o endpoit como um POST!";
    }
    @DeleteMapping
    public String deleteUser() {
        return "chamei o endpoint como um DELETE!";
    }
    @PatchMapping
    public String patchUser(){
        return "chamei o endpoint como um PATCH!";
        }
    @PutMapping
    public String putUser(){
        return "chamei o endpoint como um PUT!";
    }

    }

