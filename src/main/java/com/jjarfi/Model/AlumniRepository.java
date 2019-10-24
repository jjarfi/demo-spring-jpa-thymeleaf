package com.jjarfi.Model;

import com.jjarfi.DAO.AlumniDao;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AlumniRepository extends PagingAndSortingRepository<AlumniDao, String> {

    List<AlumniDao> findAll();

    AlumniDao findByNim(String nim);


}
