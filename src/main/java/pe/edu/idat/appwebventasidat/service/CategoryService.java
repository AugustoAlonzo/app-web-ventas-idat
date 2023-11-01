package pe.edu.idat.appwebventasidat.service;

import lombok.NoArgsConstructor;
import pe.edu.idat.appwebventasidat.model.bd.Category;
import pe.edu.idat.appwebventasidat.repository.CategoryRepository;

import java.util.List;

@NoArgsConstructor
public class CategoryService {
    private CategoryRepository categoryRepository;

    public List<Category> listarcategorias(){

        return  categoryRepository.findAll();
    }
}
