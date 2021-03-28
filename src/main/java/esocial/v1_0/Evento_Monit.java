package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2220 - Monitoramento da Saúde do Trabalhador */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtMonit",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Monit {

  /** Evento Monitoramento da Saúde do Trabalhador. */
  private EvtMonit evtMonit;

  /**
   * Evento Monitoramento da Saúde do Trabalhador.
   *
   * @return Conteúdo do campo evtMonit
   */
  public EvtMonit getEvtMonit() {
    return this.evtMonit;
  }

  /**
   * Evento Monitoramento da Saúde do Trabalhador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_EXT_SEM_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EXISTE_EVENTO_TSV_INICIO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXISTE_VINCULO
   *
   * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * @return O objeto EvtMonit para população dos campos filhos
   */
  public EvtMonit<Evento_Monit> setEvtMonit() {
    if (this.evtMonit == null) {
      this.evtMonit = new EvtMonit(this);
    }
    return this.evtMonit;
  }

  /**
   * Evento Monitoramento da Saúde do Trabalhador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideVinculo",
        "exMedOcup",
      })
  public static class EvtMonit<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private Tipos.T_ideVinculo_sst ideVinculo;

    /** Informações do exame médico ocupacional. */
    private ExMedOcup exMedOcup;

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
    public Tipos.T_ideEvento_trab<EvtMonit<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtMonit<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * @return Conteúdo do campo ideVinculo
     */
    public Tipos.T_ideVinculo_sst getIdeVinculo() {
      return this.ideVinculo;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
     *
     * @return O objeto Tipos.T_ideVinculo_sst para população dos campos filhos
     */
    public Tipos.T_ideVinculo_sst<EvtMonit<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new Tipos.T_ideVinculo_sst(this);
      }
      return this.ideVinculo;
    }

    /**
     * Informações do exame médico ocupacional.
     *
     * @return Conteúdo do campo exMedOcup
     */
    public ExMedOcup getExMedOcup() {
      return this.exMedOcup;
    }

    /**
     * Informações do exame médico ocupacional.
     *
     * <p>CHAVE_GRUPO: {tpExameOcup}
     *
     * @return O objeto ExMedOcup para população dos campos filhos
     */
    public ExMedOcup<EvtMonit<T>> setExMedOcup() {
      if (this.exMedOcup == null) {
        this.exMedOcup = new ExMedOcup(this);
      }
      return this.exMedOcup;
    }

    public EvtMonit(Object pai) {
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
     * Informações do exame médico ocupacional.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpExameOcup",
          "aso",
          "respMonit",
        })
    public static class ExMedOcup<T> {

      /** Tipo do exame médico ocupacional. */
      private String tpExameOcup;

      /** ASO */
      private Aso aso;

      /** Informações sobre o médico responsável/coordenador do PCMSO. */
      private RespMonit respMonit;

      /**
       * Tipo do exame médico ocupacional.
       *
       * @return Conteúdo do campo tpExameOcup
       */
      public String getTpExameOcup() {
        return this.tpExameOcup;
      }

      /**
       * Tipo do exame médico ocupacional.
       *
       * <p>Validação: Se informado [0], não pode existir outro evento S-2220 para o mesmo contrato
       * com {dtAso}(./aso_dtAso) anterior.
       *
       * @param tpExameOcup Valor para atribuir ao campo tpExameOcup
       * @return O próprio ExMedOcup para continuar populando outros campos
       */
      public ExMedOcup<T> setTpExameOcup(String tpExameOcup) {
        if (!"0".equals(tpExameOcup)
            && !"1".equals(tpExameOcup)
            && !"2".equals(tpExameOcup)
            && !"3".equals(tpExameOcup)
            && !"4".equals(tpExameOcup)
            && !"9".equals(tpExameOcup))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpExameOcup) + " inválido para o campo tpExameOcup");
        this.tpExameOcup = tpExameOcup;
        return this;
      }
      /**
       * Exame médico admissional
       *
       * @return O próprio ExMedOcup para continuar populando outros campos
       */
      public ExMedOcup<T> setTpExameOcup_0() {
        this.tpExameOcup = "0";
        return this;
      }
      /**
       * Exame médico periódico, conforme Norma Regulamentadora 07 - NR-07 e/ou planejamento do
       * Programa de Controle Médico de Saúde Ocupacional - PCMSO
       *
       * @return O próprio ExMedOcup para continuar populando outros campos
       */
      public ExMedOcup<T> setTpExameOcup_1() {
        this.tpExameOcup = "1";
        return this;
      }
      /**
       * Exame médico de retorno ao trabalho
       *
       * @return O próprio ExMedOcup para continuar populando outros campos
       */
      public ExMedOcup<T> setTpExameOcup_2() {
        this.tpExameOcup = "2";
        return this;
      }
      /**
       * Exame médico de mudança de função
       *
       * @return O próprio ExMedOcup para continuar populando outros campos
       */
      public ExMedOcup<T> setTpExameOcup_3() {
        this.tpExameOcup = "3";
        return this;
      }
      /**
       * Exame médico de monitoração pontual, não enquadrado nos demais casos
       *
       * @return O próprio ExMedOcup para continuar populando outros campos
       */
      public ExMedOcup<T> setTpExameOcup_4() {
        this.tpExameOcup = "4";
        return this;
      }
      /**
       * Exame médico demissional
       *
       * @return O próprio ExMedOcup para continuar populando outros campos
       */
      public ExMedOcup<T> setTpExameOcup_9() {
        this.tpExameOcup = "9";
        return this;
      }

      /**
       * ASO
       *
       * @return Conteúdo do campo aso
       */
      public Aso getAso() {
        return this.aso;
      }

      /**
       * ASO
       *
       * <p>DESCRICAO_COMPLETA:Detalhamento das informações do Atestado de Saúde Ocupacional - ASO.
       *
       * <p>CHAVE_GRUPO: {dtAso}
       *
       * @return O objeto Aso para população dos campos filhos
       */
      public Aso<ExMedOcup<T>> setAso() {
        if (this.aso == null) {
          this.aso = new Aso(this);
        }
        return this.aso;
      }

      /**
       * Informações sobre o médico responsável/coordenador do PCMSO.
       *
       * @return Conteúdo do campo respMonit
       */
      public RespMonit getRespMonit() {
        return this.respMonit;
      }

      /**
       * Informações sobre o médico responsável/coordenador do PCMSO.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto RespMonit para população dos campos filhos
       */
      public RespMonit<ExMedOcup<T>> setRespMonit() {
        if (this.respMonit == null) {
          this.respMonit = new RespMonit(this);
        }
        return this.respMonit;
      }

      public ExMedOcup(Object pai) {
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
       * ASO
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtAso", "resAso", "exame", "medico",
          })
      public static class Aso<T> {

        /** Data de emissão do ASO. */
        private javax.xml.datatype.XMLGregorianCalendar dtAso;

        /** Resultado do ASO. */
        private String resAso;

        /**
         * Avaliações clínicas e exames complementares realizados
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         */
        private java.util.List<Exame> exame;

        /** Informações sobre o médico emitente do ASO. */
        private Medico medico;

        /**
         * Data de emissão do ASO.
         *
         * @return Conteúdo do campo dtAso
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtAso() {
          return this.dtAso;
        }

        /**
         * Data de emissão do ASO.
         *
         * <p>Validação: Deve ser uma data válida, igual ou anterior à data atual e igual ou
         * posterior à data de início da obrigatoriedade deste evento para o empregador no eSocial.
         *
         * @param dtAso Valor para atribuir ao campo dtAso
         * @return O próprio Aso para continuar populando outros campos
         */
        public Aso<T> setDtAso(javax.xml.datatype.XMLGregorianCalendar dtAso) {
          this.dtAso = dtAso;
          return this;
        }

        /**
         * Resultado do ASO.
         *
         * @return Conteúdo do campo resAso
         */
        public String getResAso() {
          return this.resAso;
        }

        /**
         * Resultado do ASO.
         *
         * @param resAso Valor para atribuir ao campo resAso
         * @return O próprio Aso para continuar populando outros campos
         */
        public Aso<T> setResAso(String resAso) {
          if (!"1".equals(resAso) && !"2".equals(resAso))
            throw new RuntimeException(
                "Valor " + String.valueOf(resAso) + " inválido para o campo resAso");
          this.resAso = resAso;
          return this;
        }
        /**
         * Apto
         *
         * @return O próprio Aso para continuar populando outros campos
         */
        public Aso<T> setResAso_1() {
          this.resAso = "1";
          return this;
        }
        /**
         * Inapto
         *
         * @return O próprio Aso para continuar populando outros campos
         */
        public Aso<T> setResAso_2() {
          this.resAso = "2";
          return this;
        }

        /**
         * Avaliações clínicas e exames complementares realizados
         *
         * @return Conteúdo do campo exame
         */
        public java.util.List<Exame> getExame() {
          return this.exame;
        }

        /**
         * Avaliações clínicas e exames complementares realizados
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         *
         * <p>DESCRICAO_COMPLETA:Grupo que detalha as avaliações clínicas e os exames complementares
         * porventura realizados pelo trabalhador em virtude do determinado nos Quadros I e II da
         * NR-07, além de outros solicitados pelo médico e os referentes ao ASO.
         *
         * <p>CHAVE_GRUPO: {dtExm}, {procRealizado}
         *
         * @return O objeto Exame para população dos campos filhos
         */
        public Exame<Aso<T>> setExame_Next() {
          if (this.exame == null) {
            this.exame = new java.util.ArrayList<>();
          }
          Exame toAdd = new Exame(this);
          this.exame.add(toAdd);
          return toAdd;
        }

        /**
         * Informações sobre o médico emitente do ASO.
         *
         * @return Conteúdo do campo medico
         */
        public Medico getMedico() {
          return this.medico;
        }

        /**
         * Informações sobre o médico emitente do ASO.
         *
         * @return O objeto Medico para população dos campos filhos
         */
        public Medico<Aso<T>> setMedico() {
          if (this.medico == null) {
            this.medico = new Medico(this);
          }
          return this.medico;
        }

        public Aso(Object pai) {
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
         * Avaliações clínicas e exames complementares realizados
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "dtExm",
              "procRealizado",
              "obsProc",
              "ordExame",
              "indResult",
            })
        public static class Exame<T> {

          /** Data do exame realizado. */
          private javax.xml.datatype.XMLGregorianCalendar dtExm;

          /** Código do procedimento diagnóstico. */
          private Integer procRealizado;

          /** Observação sobre o procedimento diagnóstico realizado. */
          private String obsProc;

          /** Ordem do exame. */
          private String ordExame;

          /** Indicação dos resultados. */
          private String indResult;

          /**
           * Data do exame realizado.
           *
           * @return Conteúdo do campo dtExm
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtExm() {
            return this.dtExm;
          }

          /**
           * Data do exame realizado.
           *
           * <p>Validação: Deve ser uma data válida, igual ou anterior à data do ASO informada em
           * {dtAso}(../dtAso).
           *
           * @param dtExm Valor para atribuir ao campo dtExm
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setDtExm(javax.xml.datatype.XMLGregorianCalendar dtExm) {
            this.dtExm = dtExm;
            return this;
          }

          /**
           * Código do procedimento diagnóstico.
           *
           * @return Conteúdo do campo procRealizado
           */
          public Integer getProcRealizado() {
            return this.procRealizado;
          }

          /**
           * Código do procedimento diagnóstico.
           *
           * <p>Validação: Deve ser um código válido e existente na Tabela 27.
           *
           * @param procRealizado Valor para atribuir ao campo procRealizado
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setProcRealizado(Integer procRealizado) {
            this.procRealizado = procRealizado;
            return this;
          }

          /**
           * Observação sobre o procedimento diagnóstico realizado.
           *
           * @return Conteúdo do campo obsProc
           */
          public String getObsProc() {
            return this.obsProc;
          }

          /**
           * Observação sobre o procedimento diagnóstico realizado.
           *
           * @param obsProc Valor para atribuir ao campo obsProc
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setObsProc(String obsProc) {
            this.obsProc = obsProc;
            return this;
          }

          /**
           * Ordem do exame.
           *
           * @return Conteúdo do campo ordExame
           */
          public String getOrdExame() {
            return this.ordExame;
          }

          /**
           * Ordem do exame.
           *
           * @param ordExame Valor para atribuir ao campo ordExame
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setOrdExame(String ordExame) {
            if (!"1".equals(ordExame) && !"2".equals(ordExame))
              throw new RuntimeException(
                  "Valor " + String.valueOf(ordExame) + " inválido para o campo ordExame");
            this.ordExame = ordExame;
            return this;
          }
          /**
           * Inicial
           *
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setOrdExame_1() {
            this.ordExame = "1";
            return this;
          }
          /**
           * Sequencial
           *
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setOrdExame_2() {
            this.ordExame = "2";
            return this;
          }

          /**
           * Indicação dos resultados.
           *
           * @return Conteúdo do campo indResult
           */
          public String getIndResult() {
            return this.indResult;
          }

          /**
           * Indicação dos resultados.
           *
           * @param indResult Valor para atribuir ao campo indResult
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setIndResult(String indResult) {
            if (!"1".equals(indResult)
                && !"2".equals(indResult)
                && !"3".equals(indResult)
                && !"4".equals(indResult))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indResult) + " inválido para o campo indResult");
            this.indResult = indResult;
            return this;
          }
          /**
           * Normal
           *
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setIndResult_1() {
            this.indResult = "1";
            return this;
          }
          /**
           * Alterado
           *
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setIndResult_2() {
            this.indResult = "2";
            return this;
          }
          /**
           * Estável
           *
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setIndResult_3() {
            this.indResult = "3";
            return this;
          }
          /**
           * Agravamento
           *
           * @return O próprio Exame para continuar populando outros campos
           */
          public Exame<T> setIndResult_4() {
            this.indResult = "4";
            return this;
          }

          public Exame(Object pai) {
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

        /**
         * Informações sobre o médico emitente do ASO.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "nmMed", "nrCRM", "ufCRM",
            })
        public static class Medico<T> {

          /** Preencher com o nome do médico emitente do ASO. */
          private String nmMed;

          /**
           * Número de inscrição do médico emitente do ASO no Conselho Regional de Medicina - CRM.
           */
          private String nrCRM;

          /** Preencher com a sigla da Unidade da Federação - UF de expedição do CRM. */
          private String ufCRM;

          /**
           * Preencher com o nome do médico emitente do ASO.
           *
           * @return Conteúdo do campo nmMed
           */
          public String getNmMed() {
            return this.nmMed;
          }

          /**
           * Preencher com o nome do médico emitente do ASO.
           *
           * @param nmMed Valor para atribuir ao campo nmMed
           * @return O próprio Medico para continuar populando outros campos
           */
          public Medico<T> setNmMed(String nmMed) {
            this.nmMed = nmMed;
            return this;
          }

          /**
           * Número de inscrição do médico emitente do ASO no Conselho Regional de Medicina - CRM.
           *
           * @return Conteúdo do campo nrCRM
           */
          public String getNrCRM() {
            return this.nrCRM;
          }

          /**
           * Número de inscrição do médico emitente do ASO no Conselho Regional de Medicina - CRM.
           *
           * @param nrCRM Valor para atribuir ao campo nrCRM
           * @return O próprio Medico para continuar populando outros campos
           */
          public Medico<T> setNrCRM(String nrCRM) {
            this.nrCRM = nrCRM;
            return this;
          }

          /**
           * Preencher com a sigla da Unidade da Federação - UF de expedição do CRM.
           *
           * @return Conteúdo do campo ufCRM
           */
          public String getUfCRM() {
            return this.ufCRM;
          }

          /**
           * Preencher com a sigla da Unidade da Federação - UF de expedição do CRM.
           *
           * @param ufCRM Valor para atribuir ao campo ufCRM
           * @return O próprio Medico para continuar populando outros campos
           */
          public Medico<T> setUfCRM(String ufCRM) {
            if (!"AC".equals(ufCRM)
                && !"AL".equals(ufCRM)
                && !"AP".equals(ufCRM)
                && !"AM".equals(ufCRM)
                && !"BA".equals(ufCRM)
                && !"CE".equals(ufCRM)
                && !"DF".equals(ufCRM)
                && !"ES".equals(ufCRM)
                && !"GO".equals(ufCRM)
                && !"MA".equals(ufCRM)
                && !"MT".equals(ufCRM)
                && !"MS".equals(ufCRM)
                && !"MG".equals(ufCRM)
                && !"PA".equals(ufCRM)
                && !"PB".equals(ufCRM)
                && !"PR".equals(ufCRM)
                && !"PE".equals(ufCRM)
                && !"PI".equals(ufCRM)
                && !"RJ".equals(ufCRM)
                && !"RN".equals(ufCRM)
                && !"RS".equals(ufCRM)
                && !"RO".equals(ufCRM)
                && !"RR".equals(ufCRM)
                && !"SC".equals(ufCRM)
                && !"SP".equals(ufCRM)
                && !"SE".equals(ufCRM)
                && !"TO".equals(ufCRM))
              throw new RuntimeException(
                  "Valor " + String.valueOf(ufCRM) + " inválido para o campo ufCRM");
            this.ufCRM = ufCRM;
            return this;
          }

          public Medico<T> setUfCRM_AC() {
            this.ufCRM = "AC";
            return this;
          }

          public Medico<T> setUfCRM_AL() {
            this.ufCRM = "AL";
            return this;
          }

          public Medico<T> setUfCRM_AP() {
            this.ufCRM = "AP";
            return this;
          }

          public Medico<T> setUfCRM_AM() {
            this.ufCRM = "AM";
            return this;
          }

          public Medico<T> setUfCRM_BA() {
            this.ufCRM = "BA";
            return this;
          }

          public Medico<T> setUfCRM_CE() {
            this.ufCRM = "CE";
            return this;
          }

          public Medico<T> setUfCRM_DF() {
            this.ufCRM = "DF";
            return this;
          }

          public Medico<T> setUfCRM_ES() {
            this.ufCRM = "ES";
            return this;
          }

          public Medico<T> setUfCRM_GO() {
            this.ufCRM = "GO";
            return this;
          }

          public Medico<T> setUfCRM_MA() {
            this.ufCRM = "MA";
            return this;
          }

          public Medico<T> setUfCRM_MT() {
            this.ufCRM = "MT";
            return this;
          }

          public Medico<T> setUfCRM_MS() {
            this.ufCRM = "MS";
            return this;
          }

          public Medico<T> setUfCRM_MG() {
            this.ufCRM = "MG";
            return this;
          }

          public Medico<T> setUfCRM_PA() {
            this.ufCRM = "PA";
            return this;
          }

          public Medico<T> setUfCRM_PB() {
            this.ufCRM = "PB";
            return this;
          }

          public Medico<T> setUfCRM_PR() {
            this.ufCRM = "PR";
            return this;
          }

          public Medico<T> setUfCRM_PE() {
            this.ufCRM = "PE";
            return this;
          }

          public Medico<T> setUfCRM_PI() {
            this.ufCRM = "PI";
            return this;
          }

          public Medico<T> setUfCRM_RJ() {
            this.ufCRM = "RJ";
            return this;
          }

          public Medico<T> setUfCRM_RN() {
            this.ufCRM = "RN";
            return this;
          }

          public Medico<T> setUfCRM_RS() {
            this.ufCRM = "RS";
            return this;
          }

          public Medico<T> setUfCRM_RO() {
            this.ufCRM = "RO";
            return this;
          }

          public Medico<T> setUfCRM_RR() {
            this.ufCRM = "RR";
            return this;
          }

          public Medico<T> setUfCRM_SC() {
            this.ufCRM = "SC";
            return this;
          }

          public Medico<T> setUfCRM_SP() {
            this.ufCRM = "SP";
            return this;
          }

          public Medico<T> setUfCRM_SE() {
            this.ufCRM = "SE";
            return this;
          }

          public Medico<T> setUfCRM_TO() {
            this.ufCRM = "TO";
            return this;
          }

          public Medico(Object pai) {
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

      /**
       * Informações sobre o médico responsável/coordenador do PCMSO.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cpfResp", "nmResp", "nrCRM", "ufCRM",
          })
      public static class RespMonit<T> {

        /** Preencher com o CPF do médico responsável/coordenador do PCMSO. */
        private String cpfResp;

        /** Preencher com o nome do médico responsável/coordenador do PCMSO. */
        private String nmResp;

        /** Número de inscrição do médico responsável/coordenador do PCMSO no CRM. */
        private String nrCRM;

        /** Preencher com a sigla da UF de expedição do CRM. */
        private String ufCRM;

        /**
         * Preencher com o CPF do médico responsável/coordenador do PCMSO.
         *
         * @return Conteúdo do campo cpfResp
         */
        public String getCpfResp() {
          return this.cpfResp;
        }

        /**
         * Preencher com o CPF do médico responsável/coordenador do PCMSO.
         *
         * <p>Validação: Se informado, deve ser um CPF válido.
         *
         * @param cpfResp Valor para atribuir ao campo cpfResp
         * @return O próprio RespMonit para continuar populando outros campos
         */
        public RespMonit<T> setCpfResp(String cpfResp) {
          this.cpfResp = cpfResp;
          return this;
        }

        /**
         * Preencher com o nome do médico responsável/coordenador do PCMSO.
         *
         * @return Conteúdo do campo nmResp
         */
        public String getNmResp() {
          return this.nmResp;
        }

        /**
         * Preencher com o nome do médico responsável/coordenador do PCMSO.
         *
         * @param nmResp Valor para atribuir ao campo nmResp
         * @return O próprio RespMonit para continuar populando outros campos
         */
        public RespMonit<T> setNmResp(String nmResp) {
          this.nmResp = nmResp;
          return this;
        }

        /**
         * Número de inscrição do médico responsável/coordenador do PCMSO no CRM.
         *
         * @return Conteúdo do campo nrCRM
         */
        public String getNrCRM() {
          return this.nrCRM;
        }

        /**
         * Número de inscrição do médico responsável/coordenador do PCMSO no CRM.
         *
         * @param nrCRM Valor para atribuir ao campo nrCRM
         * @return O próprio RespMonit para continuar populando outros campos
         */
        public RespMonit<T> setNrCRM(String nrCRM) {
          this.nrCRM = nrCRM;
          return this;
        }

        /**
         * Preencher com a sigla da UF de expedição do CRM.
         *
         * @return Conteúdo do campo ufCRM
         */
        public String getUfCRM() {
          return this.ufCRM;
        }

        /**
         * Preencher com a sigla da UF de expedição do CRM.
         *
         * @param ufCRM Valor para atribuir ao campo ufCRM
         * @return O próprio RespMonit para continuar populando outros campos
         */
        public RespMonit<T> setUfCRM(String ufCRM) {
          if (!"AC".equals(ufCRM)
              && !"AL".equals(ufCRM)
              && !"AP".equals(ufCRM)
              && !"AM".equals(ufCRM)
              && !"BA".equals(ufCRM)
              && !"CE".equals(ufCRM)
              && !"DF".equals(ufCRM)
              && !"ES".equals(ufCRM)
              && !"GO".equals(ufCRM)
              && !"MA".equals(ufCRM)
              && !"MT".equals(ufCRM)
              && !"MS".equals(ufCRM)
              && !"MG".equals(ufCRM)
              && !"PA".equals(ufCRM)
              && !"PB".equals(ufCRM)
              && !"PR".equals(ufCRM)
              && !"PE".equals(ufCRM)
              && !"PI".equals(ufCRM)
              && !"RJ".equals(ufCRM)
              && !"RN".equals(ufCRM)
              && !"RS".equals(ufCRM)
              && !"RO".equals(ufCRM)
              && !"RR".equals(ufCRM)
              && !"SC".equals(ufCRM)
              && !"SP".equals(ufCRM)
              && !"SE".equals(ufCRM)
              && !"TO".equals(ufCRM))
            throw new RuntimeException(
                "Valor " + String.valueOf(ufCRM) + " inválido para o campo ufCRM");
          this.ufCRM = ufCRM;
          return this;
        }

        public RespMonit<T> setUfCRM_AC() {
          this.ufCRM = "AC";
          return this;
        }

        public RespMonit<T> setUfCRM_AL() {
          this.ufCRM = "AL";
          return this;
        }

        public RespMonit<T> setUfCRM_AP() {
          this.ufCRM = "AP";
          return this;
        }

        public RespMonit<T> setUfCRM_AM() {
          this.ufCRM = "AM";
          return this;
        }

        public RespMonit<T> setUfCRM_BA() {
          this.ufCRM = "BA";
          return this;
        }

        public RespMonit<T> setUfCRM_CE() {
          this.ufCRM = "CE";
          return this;
        }

        public RespMonit<T> setUfCRM_DF() {
          this.ufCRM = "DF";
          return this;
        }

        public RespMonit<T> setUfCRM_ES() {
          this.ufCRM = "ES";
          return this;
        }

        public RespMonit<T> setUfCRM_GO() {
          this.ufCRM = "GO";
          return this;
        }

        public RespMonit<T> setUfCRM_MA() {
          this.ufCRM = "MA";
          return this;
        }

        public RespMonit<T> setUfCRM_MT() {
          this.ufCRM = "MT";
          return this;
        }

        public RespMonit<T> setUfCRM_MS() {
          this.ufCRM = "MS";
          return this;
        }

        public RespMonit<T> setUfCRM_MG() {
          this.ufCRM = "MG";
          return this;
        }

        public RespMonit<T> setUfCRM_PA() {
          this.ufCRM = "PA";
          return this;
        }

        public RespMonit<T> setUfCRM_PB() {
          this.ufCRM = "PB";
          return this;
        }

        public RespMonit<T> setUfCRM_PR() {
          this.ufCRM = "PR";
          return this;
        }

        public RespMonit<T> setUfCRM_PE() {
          this.ufCRM = "PE";
          return this;
        }

        public RespMonit<T> setUfCRM_PI() {
          this.ufCRM = "PI";
          return this;
        }

        public RespMonit<T> setUfCRM_RJ() {
          this.ufCRM = "RJ";
          return this;
        }

        public RespMonit<T> setUfCRM_RN() {
          this.ufCRM = "RN";
          return this;
        }

        public RespMonit<T> setUfCRM_RS() {
          this.ufCRM = "RS";
          return this;
        }

        public RespMonit<T> setUfCRM_RO() {
          this.ufCRM = "RO";
          return this;
        }

        public RespMonit<T> setUfCRM_RR() {
          this.ufCRM = "RR";
          return this;
        }

        public RespMonit<T> setUfCRM_SC() {
          this.ufCRM = "SC";
          return this;
        }

        public RespMonit<T> setUfCRM_SP() {
          this.ufCRM = "SP";
          return this;
        }

        public RespMonit<T> setUfCRM_SE() {
          this.ufCRM = "SE";
          return this;
        }

        public RespMonit<T> setUfCRM_TO() {
          this.ufCRM = "TO";
          return this;
        }

        public RespMonit(Object pai) {
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
