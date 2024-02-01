package neoteric.com.demo.repo;

import neoteric.com.demo.model.ProfileColumn;
import neoteric.com.demo.model.ProfileImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileInterface extends JpaRepository<ProfileColumn, Long> {

}
