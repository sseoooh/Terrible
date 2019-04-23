package com.yeogil.web.Mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yeogil.web.Domain.HotelDTO;

@Repository
public interface HotelMapper {
	public void insertCustomer(HotelDTO hotel);
	public List<HotelDTO> selectAllCustomers(HashMap<String, String> hash);
	public List<HotelDTO> selectSomeCustomers(HashMap<String, String> hash);
	public HotelDTO selectCustomer(HotelDTO hotel);
	public int countCustomer();
	public void updateCustomer(HotelDTO hotel);
	public void deleteCustomer(HotelDTO hotel);
}
