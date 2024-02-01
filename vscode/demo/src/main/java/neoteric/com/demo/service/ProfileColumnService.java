package neoteric.com.demo.service;

import neoteric.com.demo.model.ProfileColumn;
import neoteric.com.demo.repo.ProfileInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfileColumnService {
    @Autowired
    ProfileInterface profileInterface;


    public List<ProfileColumn> getStudents() {
        return profileInterface.findAll();
    }
    public ProfileColumn createdata() {


            ProfileColumn profileColumn = new ProfileColumn();
            profileColumn.setColumnName("Your column name");
            profileColumn.setContent("Your content");


        return profileInterface.save(profileColumn);
    }
}
