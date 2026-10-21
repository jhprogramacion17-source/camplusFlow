package com.javDev.campusFlow.cursos.mapper;
import com.javDev.campusFlow.cursos.model.Curso;
import com.javDev.campusFlow.cursos.dto.CursoResponse;

public class CursoMapper {

    public static CursoResponse toResponse(Curso curso) {
        CursoResponse response = new CursoResponse();
        response.setId(curso.getId());
        response.setNombre(curso.getNombre());
        response.setInstructorNombre(
                curso.getInstructor() != null ? curso.getInstructor().getNombre() : null);
        response.setCantidadEstudiantes(curso.getEstudiantes().size());
        return response;
    }
}
