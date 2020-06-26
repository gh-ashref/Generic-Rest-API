package com.krendel.controller;

import com.krendel.model.Grant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grants")
public class GrantController extends GenericRestController<Grant> {

}
