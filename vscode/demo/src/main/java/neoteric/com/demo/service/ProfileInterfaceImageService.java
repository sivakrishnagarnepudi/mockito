package neoteric.com.demo.service;

import neoteric.com.demo.model.ProfileImage;
import neoteric.com.demo.repo.ProfileInterfaceImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfileInterfaceImageService {
    @Autowired
    ProfileInterfaceImage profileInterfaceImage;
    public List<ProfileImage> profileImages(){
        return profileInterfaceImage.findAll();
    }
}
