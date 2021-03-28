package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2190 - Registro Preliminar de Trabalhador */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtAdmPrelim",
    })
@XmlRootElement(name = "eSocial")
public class Evento_AdmPrelim {

  /** Evento Registro Preliminar de Trabalhador. */
  private EvtAdmPrelim evtAdmPrelim;

  /**
   * Evento Registro Preliminar de Trabalhador.
   *
   * @return Conteúdo do campo evtAdmPrelim
   */
  public EvtAdmPrelim getEvtAdmPrelim() {
    return this.evtAdmPrelim;
  }

  /**
   * Evento Registro Preliminar de Trabalhador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ADMISSAO_VALIDA_DT_ADM
   *
   * <p>REGRA:REGRA_ADMISSAO_VALIDA_DURACAO_CONTRATO
   *
   * <p>REGRA:REGRA_BLOQUEIA_USO_CPF_EMPREGADOR
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EXCLUSAO_ADMISSAO_PRELIMINAR
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_VALIDA_ADMISSAO_PRELIMINAR
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_MATRICULA
   *
   * @return O objeto EvtAdmPrelim para população dos campos filhos
   */
  public EvtAdmPrelim<Evento_AdmPrelim> setEvtAdmPrelim() {
    if (this.evtAdmPrelim == null) {
      this.evtAdmPrelim = new EvtAdmPrelim(this);
    }
    return this.evtAdmPrelim;
  }

  /**
   * Evento Registro Preliminar de Trabalhador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoRegPrelim",
      })
  public static class EvtAdmPrelim<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações do registro preliminar do trabalhador. */
    private InfoRegPrelim infoRegPrelim;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_trab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_trab para população dos campos filhos
     */
    public Tipos.T_ideEvento_trab<EvtAdmPrelim<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_trab(this);
      }
      return this.ideEvento;
    }

    /**
     * Informações de identificação do empregador.
     *
     * @return Conteúdo do campo ideEmpregador
     */
    public Tipos.T_ideEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador para população dos campos filhos
     */
    public Tipos.T_ideEmpregador<EvtAdmPrelim<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações do registro preliminar do trabalhador.
     *
     * @return Conteúdo do campo infoRegPrelim
     */
    public InfoRegPrelim getInfoRegPrelim() {
      return this.infoRegPrelim;
    }

    /**
     * Informações do registro preliminar do trabalhador.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}
     *
     * @return O objeto InfoRegPrelim para população dos campos filhos
     */
    public InfoRegPrelim<EvtAdmPrelim<T>> setInfoRegPrelim() {
      if (this.infoRegPrelim == null) {
        this.infoRegPrelim = new InfoRegPrelim(this);
      }
      return this.infoRegPrelim;
    }

    public EvtAdmPrelim(Object pai) {
      this.pai = pai;
    }

    @XmlTransient private final Object pai;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }
    /**
     * Informações do registro preliminar do trabalhador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfTrab",
          "dtNascto",
          "dtAdm",
          "matricula",
          "codCateg",
          "natAtividade",
          "infoRegCTPS",
        })
    public static class InfoRegPrelim<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /** Preencher com a data de nascimento. */
      private javax.xml.datatype.XMLGregorianCalendar dtNascto;

      /**
       * Preencher com a data de admissão do trabalhador (ou data de início, no caso de Trabalhador
       * Sem Vínculo de Emprego/Estatutário - TSVE).
       */
      private javax.xml.datatype.XMLGregorianCalendar dtAdm;

      /** Matrícula atribuída ao trabalhador pela empresa. */
      private String matricula;

      /** Preencher com o código da categoria do trabalhador. */
      private Integer codCateg;

      /** Natureza da atividade. */
      private String natAtividade;

      /** Informações referentes ao registro e à CTPS Digital */
      private InfoRegCTPS infoRegCTPS;

      /**
       * Preencher com o número do CPF do trabalhador.
       *
       * @return Conteúdo do campo cpfTrab
       */
      public String getCpfTrab() {
        return this.cpfTrab;
      }

      /**
       * Preencher com o número do CPF do trabalhador.
       *
       * @param cpfTrab Valor para atribuir ao campo cpfTrab
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

      /**
       * Preencher com a data de nascimento.
       *
       * @return Conteúdo do campo dtNascto
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtNascto() {
        return this.dtNascto;
      }

      /**
       * Preencher com a data de nascimento.
       *
       * @param dtNascto Valor para atribuir ao campo dtNascto
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setDtNascto(javax.xml.datatype.XMLGregorianCalendar dtNascto) {
        this.dtNascto = dtNascto;
        return this;
      }

      /**
       * Preencher com a data de admissão do trabalhador (ou data de início, no caso de Trabalhador
       * Sem Vínculo de Emprego/Estatutário - TSVE).
       *
       * @return Conteúdo do campo dtAdm
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAdm() {
        return this.dtAdm;
      }

      /**
       * Preencher com a data de admissão do trabalhador (ou data de início, no caso de Trabalhador
       * Sem Vínculo de Emprego/Estatutário - TSVE).
       *
       * <p>Validação: Deve ser posterior à data de nascimento do trabalhador e igual ou posterior à
       * data de início da obrigatoriedade dos eventos não periódicos para o empregador.
       *
       * @param dtAdm Valor para atribuir ao campo dtAdm
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setDtAdm(javax.xml.datatype.XMLGregorianCalendar dtAdm) {
        this.dtAdm = dtAdm;
        return this;
      }

      /**
       * Matrícula atribuída ao trabalhador pela empresa.
       *
       * @return Conteúdo do campo matricula
       */
      public String getMatricula() {
        return this.matricula;
      }

      /**
       * Matrícula atribuída ao trabalhador pela empresa.
       *
       * <p>Validação: O valor informado não pode conter a expressão 'eSocial' nas 7 (sete)
       * primeiras posições.
       *
       * <p>REGRA:REGRA_CARACTERE_ESPECIAL
       *
       * @param matricula Valor para atribuir ao campo matricula
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
      }

      /**
       * Preencher com o código da categoria do trabalhador.
       *
       * @return Conteúdo do campo codCateg
       */
      public Integer getCodCateg() {
        return this.codCateg;
      }

      /**
       * Preencher com o código da categoria do trabalhador.
       *
       * <p>Validação: Deve ser um código de categoria sujeito ao Registro de Eventos Trabalhistas -
       * RET de trabalhador não vinculado ao Regime Próprio de Previdência Social - RPPS, ou seja,
       * "Empregado" ([1XX]), algumas categorias de "Agente Público" ([301, 302, 303, 304, 306, 307,
       * 309, 310, 312]), "Avulso" ([2XX]), "Cessão" ([4XX]), algumas categorias de "Contribuinte
       * Individual" ([721, 722, 723, 731, 734, 738, 761, 771]) ou de "Bolsista" ([901, 902]).
       *
       * @param codCateg Valor para atribuir ao campo codCateg
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setCodCateg(Integer codCateg) {
        this.codCateg = codCateg;
        return this;
      }

      /**
       * Natureza da atividade.
       *
       * @return Conteúdo do campo natAtividade
       */
      public String getNatAtividade() {
        return this.natAtividade;
      }

      /**
       * Natureza da atividade.
       *
       * <p>Validação: Preenchimento obrigatório se {codCateg}(./codCateg) for relativo a
       * "Empregado", "Agente Público", "Avulso" ou igual a [401, 731, 734, 738]. Não deve ser
       * preenchido se {codCateg}(./codCateg) = [721, 722, 771, 901].
       *
       * <p>Se {codCateg}(./codCateg) = [104], deve ser preenchido com [1]. Se
       * {codCateg}(./codCateg) = [102], deve ser preenchido com [2].
       *
       * @param natAtividade Valor para atribuir ao campo natAtividade
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setNatAtividade(String natAtividade) {
        if (!"1".equals(natAtividade) && !"2".equals(natAtividade))
          throw new RuntimeException(
              "Valor " + String.valueOf(natAtividade) + " inválido para o campo natAtividade");
        this.natAtividade = natAtividade;
        return this;
      }
      /**
       * Trabalho urbano
       *
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setNatAtividade_1() {
        this.natAtividade = "1";
        return this;
      }
      /**
       * Trabalho rural
       *
       * @return O próprio InfoRegPrelim para continuar populando outros campos
       */
      public InfoRegPrelim<T> setNatAtividade_2() {
        this.natAtividade = "2";
        return this;
      }

      /**
       * Informações referentes ao registro e à CTPS Digital
       *
       * @return Conteúdo do campo infoRegCTPS
       */
      public InfoRegCTPS getInfoRegCTPS() {
        return this.infoRegCTPS;
      }

      /**
       * Informações referentes ao registro e à CTPS Digital
       *
       * <p>DESCRICAO_COMPLETA:Informações referentes ao registro eletrônico de empregados e à
       * Carteira de Trabalho e Previdência Digital - CTPS Digital.
       *
       * <p>CONDICAO_GRUPO: OC (se {codCateg}(2190_infoRegPrelim_codCateg) for relativo a
       * "Empregado" ou "Agente Público"); N (nos demais casos)
       *
       * @return O objeto InfoRegCTPS para população dos campos filhos
       */
      public InfoRegCTPS<InfoRegPrelim<T>> setInfoRegCTPS() {
        if (this.infoRegCTPS == null) {
          this.infoRegCTPS = new InfoRegCTPS(this);
        }
        return this.infoRegCTPS;
      }

      public InfoRegPrelim(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
      /**
       * Informações referentes ao registro e à CTPS Digital
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "CBOCargo",
            "vrSalFx",
            "undSalFixo",
            "tpContr",
            "dtTerm",
          })
      public static class InfoRegCTPS<T> {

        /** Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo. */
        private String CBOCargo;

        /** Salário base do trabalhador, correspondente à parte fixa da remuneração. */
        private Double vrSalFx;

        /** Unidade de pagamento da parte fixa da remuneração. */
        private String undSalFixo;

        /** Tipo de contrato de trabalho. */
        private String tpContr;

        /** Data do término do contrato por prazo determinado. */
        private javax.xml.datatype.XMLGregorianCalendar dtTerm;

        /**
         * Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo.
         *
         * @return Conteúdo do campo CBOCargo
         */
        public String getCBOCargo() {
          return this.CBOCargo;
        }

        /**
         * Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo.
         *
         * <p>Validação: Deve ser um código válido e existente na tabela de CBO, com 6 (seis)
         * posições.
         *
         * @param CBOCargo Valor para atribuir ao campo CBOCargo
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setCBOCargo(String CBOCargo) {
          this.CBOCargo = CBOCargo;
          return this;
        }

        /**
         * Salário base do trabalhador, correspondente à parte fixa da remuneração.
         *
         * @return Conteúdo do campo vrSalFx
         */
        public Double getVrSalFx() {
          return this.vrSalFx;
        }

        /**
         * Salário base do trabalhador, correspondente à parte fixa da remuneração.
         *
         * <p>Validação: Se {undSalFixo}(./undSalFixo) for igual a [7], preencher com 0 (zero).
         *
         * @param vrSalFx Valor para atribuir ao campo vrSalFx
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setVrSalFx(Double vrSalFx) {
          this.vrSalFx = vrSalFx;
          return this;
        }

        /**
         * Unidade de pagamento da parte fixa da remuneração.
         *
         * @return Conteúdo do campo undSalFixo
         */
        public String getUndSalFixo() {
          return this.undSalFixo;
        }

        /**
         * Unidade de pagamento da parte fixa da remuneração.
         *
         * @param undSalFixo Valor para atribuir ao campo undSalFixo
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo(String undSalFixo) {
          if (!"1".equals(undSalFixo)
              && !"2".equals(undSalFixo)
              && !"3".equals(undSalFixo)
              && !"4".equals(undSalFixo)
              && !"5".equals(undSalFixo)
              && !"6".equals(undSalFixo)
              && !"7".equals(undSalFixo))
            throw new RuntimeException(
                "Valor " + String.valueOf(undSalFixo) + " inválido para o campo undSalFixo");
          this.undSalFixo = undSalFixo;
          return this;
        }
        /**
         * Por hora
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo_1() {
          this.undSalFixo = "1";
          return this;
        }
        /**
         * Por dia
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo_2() {
          this.undSalFixo = "2";
          return this;
        }
        /**
         * Por semana
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo_3() {
          this.undSalFixo = "3";
          return this;
        }
        /**
         * Por quinzena
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo_4() {
          this.undSalFixo = "4";
          return this;
        }
        /**
         * Por mês
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo_5() {
          this.undSalFixo = "5";
          return this;
        }
        /**
         * Por tarefa
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo_6() {
          this.undSalFixo = "6";
          return this;
        }
        /**
         * Não aplicável - Salário exclusivamente variável
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setUndSalFixo_7() {
          this.undSalFixo = "7";
          return this;
        }

        /**
         * Tipo de contrato de trabalho.
         *
         * @return Conteúdo do campo tpContr
         */
        public String getTpContr() {
          return this.tpContr;
        }

        /**
         * Tipo de contrato de trabalho.
         *
         * @param tpContr Valor para atribuir ao campo tpContr
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setTpContr(String tpContr) {
          if (!"1".equals(tpContr) && !"2".equals(tpContr) && !"3".equals(tpContr))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpContr) + " inválido para o campo tpContr");
          this.tpContr = tpContr;
          return this;
        }
        /**
         * Prazo indeterminado
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setTpContr_1() {
          this.tpContr = "1";
          return this;
        }
        /**
         * Prazo determinado, definido em dias
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setTpContr_2() {
          this.tpContr = "2";
          return this;
        }
        /**
         * Prazo determinado, vinculado à ocorrência de um fato
         *
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setTpContr_3() {
          this.tpContr = "3";
          return this;
        }

        /**
         * Data do término do contrato por prazo determinado.
         *
         * @return Conteúdo do campo dtTerm
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTerm() {
          return this.dtTerm;
        }

        /**
         * Data do término do contrato por prazo determinado.
         *
         * <p>Validação: O preenchimento é obrigatório se {tpContr}(./tpContr) = [2]. Não informar
         * se {tpContr}(./tpContr) = [1]. Deve ser igual ou posterior à data de admissão.
         *
         * @param dtTerm Valor para atribuir ao campo dtTerm
         * @return O próprio InfoRegCTPS para continuar populando outros campos
         */
        public InfoRegCTPS<T> setDtTerm(javax.xml.datatype.XMLGregorianCalendar dtTerm) {
          this.dtTerm = dtTerm;
          return this;
        }

        public InfoRegCTPS(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }
    }
  }
}
