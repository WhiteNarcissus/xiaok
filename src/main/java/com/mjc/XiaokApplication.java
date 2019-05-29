package com.mjc;

import com.mjc.mapper.TkMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages = {"com.mjc.mapper"}, markerInterface = TkMapper.class)
@SpringBootApplication
public class XiaokApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaokApplication.class, args);
	}

}
