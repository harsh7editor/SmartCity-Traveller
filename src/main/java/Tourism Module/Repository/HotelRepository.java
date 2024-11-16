import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository<Hotel> extends JpaRepository<Hotel, Long> {
    List<Hotel> findByLocation(String location);
}
