﻿using EditoraCrescer.Infraestrutura;
using EditoraCrescer.Infraestrutura.Entidades;
using EditoraCrescer.Infraestrutura.Repositorios;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace EditoraCrescer.Api.Controllers
{
    [RoutePrefix("api/Livros")]
    public class LivrosController : ApiController
    {
        private LivroRepositorio repositorio = new LivroRepositorio();

        
        [HttpGet]
        public IHttpActionResult ObterTodos()
        {
            var livros = repositorio.Obter();
            return Ok(livros);
        }

        [Route("{isbn:int}")]
        [HttpGet]
        public IHttpActionResult ObterPorId(int Isbn)
        {
            repositorio.ObterPorId(Isbn);
            return Ok();
        }

        [Route("{genero}")]
        [HttpGet]
        public IHttpActionResult ObterPorGenero(string genero)
        {
            var livro = repositorio.ObterPorGenero(genero);
            return Ok(new { dados = livro });
        }

        [HttpPost]
        public IHttpActionResult Criar(Livro livro)
        {
            repositorio.Criar(livro);
            return Ok();
        }

        [HttpPut]
        [Route("{isbn}")]
        public IHttpActionResult Alterar (Livro livro)
        {
            repositorio.Alterar(livro);
            return Ok();
        }

        [HttpDelete]
        [Route("{isbn}")]
        public IHttpActionResult Deletar(int Isbn)
        {
            repositorio.Deletar(Isbn);
            return Ok();
        }
    }
}