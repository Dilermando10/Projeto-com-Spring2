package com.example.projectspring2.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectspring2.entities.Category;

@RestController // define que essa classe vai ser um recurso REST
@RequestMapping(value = "/categories") // define o caminho pelo qual esse recurso vai responder
public class CategoryResource {

	@GetMapping // quando executar uma requisição GET no caminho "/categories" vai ser chamado metodo ResponseEntity
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category (1L, "Eletrononics"));
		list.add(new Category (2L, "Books"));
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {  
		Category cat = new Category(1l, "Eletronics");
		return ResponseEntity.ok().body(cat);
	}
}
