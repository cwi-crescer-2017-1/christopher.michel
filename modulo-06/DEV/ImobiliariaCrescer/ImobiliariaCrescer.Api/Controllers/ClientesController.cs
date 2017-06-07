﻿using ImobiliariaCrescer.Infraestrutura.Repositorios;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace ImobiliariaCrescer.Api.Controllers
{
    [RoutePrefix("api/clientes")]
    public class ClientesController : ApiController
    {
        private ClienteRepositorio repositorio = new ClienteRepositorio();

        //get


        //get por id
        [Route("{id:int}")]
        [HttpGet]
        public HttpResponseMessage ObterClientePorId(int id)
        {
            var cliente = repositorio.ObterPorId(id);
            if (cliente.Equals(null))
            {
                return Request.CreateResponse(HttpStatusCode.NotFound, new { alert = "Não há registros com o ID informado." });
            }
            return Request.CreateResponse(HttpStatusCode.OK, new { dados = cliente });
        }

        //post

    }
}
