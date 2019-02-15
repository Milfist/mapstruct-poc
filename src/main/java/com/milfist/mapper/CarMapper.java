package com.milfist.mapper;

import com.milfist.dto.CarDto;
import com.milfist.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

  CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

  @Mapping(source = "numberOfSeats", target = "seatCount")
  CarDto carToCarDto(Car car);

  @Mapping(source = "seatCount", target = "numberOfSeats")
  Car carDtoToCar(CarDto carDto);

  @Mappings({
      @Mapping(target = "make", expression = "java(carDto.getMake() + \" \" + carDto.getMake())")
  })
  Car carDtoToCarWithExpression(CarDto carDto);
}




