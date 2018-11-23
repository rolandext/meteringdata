package com.rolandbalogh.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rolandbalogh.example.model.Meter;

@Repository
public interface MeterRepository extends JpaRepository<Meter, Long> {
	
	List<Meter> findByClientId(Long clientId);
	
	@Query(value = "select * from meter where year = :year order by value desc limit 1", nativeQuery = true)
	List<Meter> findByYearLastTotal(@Param("year") String year);

	@Query(value = "select * from meter order by value desc limit 12", nativeQuery = true)
	List<Meter> findByClientIdOneYear(Long clientId);

	@Query(value = "select * from meter where (year = :year and (month = 'January' or month = 'january'))", nativeQuery = true)
	List<Meter> findByIdYearJanuary(String year);

	@Query(value = "select * from meter where (year = :year and (month = 'February' or month = 'february'))", nativeQuery = true)
	List<Meter> findByIdYearFebruary(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'March' or month = 'march'))", nativeQuery = true)
	List<Meter> findByIdYearMarch(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'April' or month = 'april'))", nativeQuery = true)
	List<Meter> findByIdYearApril(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'May' or month = 'may'))", nativeQuery = true)
	List<Meter> findByIdYearMay(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'June' or month = 'june'))", nativeQuery = true)
	List<Meter> findByIdYearJune(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'July' or month = 'july'))", nativeQuery = true)
	List<Meter> findByIdYearJuly(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'August' or month = 'august'))", nativeQuery = true)
	List<Meter> findByIdYearAugust(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'September' or month = 'september'))", nativeQuery = true)
	List<Meter> findByIdYearSeptember(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'October' or month = 'october'))", nativeQuery = true)
	List<Meter> findByIdYearOctober(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'November' or month = 'november'))", nativeQuery = true)
	List<Meter> findByIdYearNovember(String year);
	
	@Query(value = "select * from meter where (year = :year and (month = 'December' or month = 'december'))", nativeQuery = true)
	List<Meter> findByIdYearDecember(String year);

}