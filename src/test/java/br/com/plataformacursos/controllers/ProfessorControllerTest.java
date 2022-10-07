package br.com.plataformacursos.controllers;

import br.com.plataformacursos.models.Materia;
import br.com.plataformacursos.models.Professor;
import br.com.plataformacursos.services.ProfessorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

@ExtendWith(MockitoExtension.class)
class ProfessorControllerTest {
    @Mock
    ProfessorService professorService;

    @InjectMocks
    ProfessorController professorController = new ProfessorController();

    @Test
    public void GetAllProfessorSuccessTest() {
        doReturn(getListProfessor()).when(professorService).getAllProfessor();

        ResponseEntity<List<Professor>> result =  professorController.getAllProfessor();

        assertEquals(200, result.getStatusCodeValue());
        assertThat(result.getBody()).usingRecursiveComparison().isEqualTo(getListProfessor());
    }

    @Test
    public void GetAllProfessorExceptionTest() {
        doThrow(RuntimeException.class).when(professorService).getAllProfessor();

        ResponseEntity<List<Professor>> result =  professorController.getAllProfessor();

        assertEquals(500, result.getStatusCodeValue());
    }

    private List<Professor> getListProfessor() {
        ArrayList<Professor> listProfessor = new ArrayList<>();

        listProfessor.add(new Professor(1, "José", null));
        listProfessor.add(new Professor(2, "João", null));

        return listProfessor;
    }
}