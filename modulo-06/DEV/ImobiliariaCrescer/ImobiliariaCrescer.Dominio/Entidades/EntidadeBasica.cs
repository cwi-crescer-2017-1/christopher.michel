﻿using System.Collections.Generic;

namespace ImobiliariaCrescer.Dominio.Entidades
{
    public abstract class EntidadeBasica
    {
        public List<string> Mensagens { get; private set; }

        public EntidadeBasica()
        {
            Mensagens = new List<string>();
        }

        public abstract bool Validar();
    }
}