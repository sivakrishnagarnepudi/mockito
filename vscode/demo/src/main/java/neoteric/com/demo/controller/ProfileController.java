package neoteric.com.demo.controller;

import neoteric.com.demo.model.ProfileColumn;
import neoteric.com.demo.model.ProfileImage;
import neoteric.com.demo.repo.ProfileInterface;
import neoteric.com.demo.repo.ProfileInterfaceImage;
import neoteric.com.demo.service.ProfileColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {
@Autowired
    ProfileInterface anInterface;
    ProfileColumnService a;

    @PostMapping(value = "/getSudents")
    public ProfileColumn getStudents(){
        return a.createdata();
    }
    @Autowired
    ProfileInterfaceImage profileInterfaceImage;
    @GetMapping(value="/getProfileInterfaceImage")
    public List<ProfileImage> getProfileImages(){
        return profileInterfaceImage.findAll();
    }


}
