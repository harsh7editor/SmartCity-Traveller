import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/api/tourism")
public class TourismController<HotelRepository, Hotel> {
    @Autowired
    private HotelRepository hotelRepository;

    @SuppressWarnings("unchecked")
    @GetMapping("/hotels")
    public List<Hotel> getHotels(@RequestParam String location) {
        return (List<Hotel>) ((Object) hotelRepository);
    }
}
