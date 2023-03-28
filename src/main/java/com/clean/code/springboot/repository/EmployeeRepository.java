package com.clean.code.SpringBoot.repository;

import com.clean.code.SpringBoot.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  List<Employee> findByName(String name);
      List<Employee> findByNameAndLastName(String name, String lastName);

  //    2nd way of findByName
      @Query("select e from Employee e where e.name = :name")
      List<Employee> findByNameQuery(@Param("name") String name);

  //    3rd way of findByName
      @Query(value = "select * from employee e where e.name = :name", nativeQuery = true)
      List<Employee> findByNameQueryNative(@Param("name") String name);

      List<Employee> findAllByNameLike(String name);
      List<Employee> findAllByNameStartingWith(String name);
      List<Employee> findAllByNameEndingWith(String name);

  //    2nd way of findAllByName
      @Query("select e from Employee e where UPPER(e.name) like upper(concat('%', :name, '%'))")
      List<Employee> findAllByNameLikeQuery(String name);

  //    3rd way of findAllByName
      @Query(value = "select * from employee e where e.name like %:name%", nativeQuery = true)
      List<Employee> findAllByNameLikeNative(@Param("name") String name);
}
