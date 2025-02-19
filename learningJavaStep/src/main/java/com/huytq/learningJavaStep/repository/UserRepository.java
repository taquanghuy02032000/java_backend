package com.huytq.learningJavaStep.repository;

import com.huytq.learningJavaStep.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//interface này đại diện cho lơpx truy vấn dữ  từ entity User với khoá chính là String
public interface UserRepository extends JpaRepository<User, String> {

}
