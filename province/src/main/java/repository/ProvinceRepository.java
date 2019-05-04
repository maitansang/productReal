package repository;

import model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province,Long> {
}
