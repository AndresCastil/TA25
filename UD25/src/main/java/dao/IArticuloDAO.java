package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Articulo;

public interface IArticuloDAO  extends JpaRepository<Articulo, Integer>{

}
