package com.sanhotels.email.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanhotels.email.entity.EmailToPost;

public interface EmailRepository extends JpaRepository<EmailToPost, Long> {

	List<EmailToPost> findAllByIdhotel(Long idhotel);

	Optional<EmailToPost> findAllByIdEmailAndIdhotel(Long id, Long idhotel);

	Optional<EmailToPost> findAllByModelNameAndIdhotel(String modelname, Long idhotel);

	void deleteByIdEmailAndIdhotel(Long id, Long idhotel);

}
