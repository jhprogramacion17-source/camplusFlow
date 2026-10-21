package com.javDev.campusFlow.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javDev.campusFlow.cursos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}