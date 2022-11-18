package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Fabricante;


public interface IFabricanteDAO extends JpaRepository <Fabricante, Integer>{ 

}
