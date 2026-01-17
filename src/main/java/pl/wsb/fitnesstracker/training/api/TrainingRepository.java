
package pl.wsb.fitnesstracker.training.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {

    @Query("""
        select t
        from Training t
        join fetch t.user u
        where t.startTime < :end
          and t.endTime   >= :start
    """)
    List<Training> findOverlapping(@Param("start") Date start, @Param("end") Date end);
}
