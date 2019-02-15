import com.milfist.dto.CarDto;
import com.milfist.enumerator.CarType;
import com.milfist.mapper.CarMapper;
import com.milfist.model.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MapperTest {

  @Test
  public void shouldMapCarToDto() {
    //given
    Car car = new Car( "Morris", 5, CarType.SEDAN );

    //when
    CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

    //then
    assertNotNull(carDto);
    assertEquals(carDto.getMake(), "Morris");
    assertEquals(carDto.getSeatCount(), 5);
    assertEquals(carDto.getType(), "SEDAN");

  }

  @Test
  public void shouldMapCarDtoToCar() {
    //given
    CarDto carDto = new CarDto("Morris", 5, "SEDAN");


    //when
    Car car = CarMapper.INSTANCE.carDtoToCar(carDto);

    //then
    assertNotNull(car);
    assertEquals(car.getMake(), "Morris");
    assertEquals(car.getNumberOfSeats(), 5);
    assertEquals(car.getType(), CarType.SEDAN);

  }

  @Test
  public void shouldMapCarDtoToCar_with_expression() {
    //given
    CarDto carDto = new CarDto("Morris", 5, "SEDAN");


    //when
    Car car = CarMapper.INSTANCE.carDtoToCarWithExpression(carDto);

    //then
    assertNotNull(car);
    assertEquals(car.getMake(), "Morris Morris");

  }

}



