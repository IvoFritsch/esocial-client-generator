package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2306 - Trabalhador Sem Vínculo de Emprego/Estatutário - Alteração Contratual */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtTSVAltContr",
    })
@XmlRootElement(name = "eSocial")
public class Evento_TSVAltContr {

  /** Evento TSVE - Alteração Contratual */
  private EvtTSVAltContr evtTSVAltContr;

  /**
   * Evento TSVE - Alteração Contratual
   *
   * @return Conteúdo do campo evtTSVAltContr
   */
  public EvtTSVAltContr getEvtTSVAltContr() {
    return this.evtTSVAltContr;
  }

  /**
   * Evento TSVE - Alteração Contratual
   *
   * <p>DESCRICAO_COMPLETA:Evento Trabalhador Sem Vínculo de Emprego/Estatutário - Alteração
   * Contratual.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_TSV_ATIVO_NA_DTEVENTO
   *
   * <p>REGRA:REGRA_VALIDA_TRABALHADOR_BASE_CPF
   *
   * @return O objeto EvtTSVAltContr para população dos campos filhos
   */
  public EvtTSVAltContr<Evento_TSVAltContr> setEvtTSVAltContr() {
    if (this.evtTSVAltContr == null) {
      this.evtTSVAltContr = new EvtTSVAltContr(this);
    }
    return this.evtTSVAltContr;
  }

  /**
   * Evento TSVE - Alteração Contratual
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideTrabSemVinculo",
        "infoTSVAlteracao",
      })
  public static class EvtTSVAltContr<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do TSVE */
    private Tipos.T_ideTrabSemVinculo ideTrabSemVinculo;

    /** TSVE - Alteração Contratual. */
    private InfoTSVAlteracao infoTSVAlteracao;

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
    public Tipos.T_ideEvento_trab<EvtTSVAltContr<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtTSVAltContr<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do TSVE
     *
     * @return Conteúdo do campo ideTrabSemVinculo
     */
    public Tipos.T_ideTrabSemVinculo getIdeTrabSemVinculo() {
      return this.ideTrabSemVinculo;
    }

    /**
     * Identificação do TSVE
     *
     * <p>DESCRICAO_COMPLETA:Identificação do Trabalhador Sem Vínculo de Emprego/Estatutário - TSVE.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
     *
     * @return O objeto Tipos.T_ideTrabSemVinculo para população dos campos filhos
     */
    public Tipos.T_ideTrabSemVinculo<EvtTSVAltContr<T>> setIdeTrabSemVinculo() {
      if (this.ideTrabSemVinculo == null) {
        this.ideTrabSemVinculo = new Tipos.T_ideTrabSemVinculo(this);
      }
      return this.ideTrabSemVinculo;
    }

    /**
     * TSVE - Alteração Contratual.
     *
     * @return Conteúdo do campo infoTSVAlteracao
     */
    public InfoTSVAlteracao getInfoTSVAlteracao() {
      return this.infoTSVAlteracao;
    }

    /**
     * TSVE - Alteração Contratual.
     *
     * <p>CHAVE_GRUPO: {dtAlteracao}
     *
     * @return O objeto InfoTSVAlteracao para população dos campos filhos
     */
    public InfoTSVAlteracao<EvtTSVAltContr<T>> setInfoTSVAlteracao() {
      if (this.infoTSVAlteracao == null) {
        this.infoTSVAlteracao = new InfoTSVAlteracao(this);
      }
      return this.infoTSVAlteracao;
    }

    public EvtTSVAltContr(Object pai) {
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
     * TSVE - Alteração Contratual.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtAlteracao",
          "natAtividade",
          "infoComplementares",
        })
    public static class InfoTSVAlteracao<T> {

      /** Preencher com a data da alteração das informações. */
      private javax.xml.datatype.XMLGregorianCalendar dtAlteracao;

      /** Natureza da atividade. */
      private String natAtividade;

      /** Informações complementares */
      private InfoComplementares infoComplementares;

      /**
       * Preencher com a data da alteração das informações.
       *
       * @return Conteúdo do campo dtAlteracao
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAlteracao() {
        return this.dtAlteracao;
      }

      /**
       * Preencher com a data da alteração das informações.
       *
       * <p>Validação: Não pode ser posterior a 180 (cento e oitenta) dias da data atual.
       *
       * @param dtAlteracao Valor para atribuir ao campo dtAlteracao
       * @return O próprio InfoTSVAlteracao para continuar populando outros campos
       */
      public InfoTSVAlteracao<T> setDtAlteracao(
          javax.xml.datatype.XMLGregorianCalendar dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
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
       * <p>Validação: Preenchimento obrigatório se o código de categoria no Registro de Eventos
       * Trabalhistas - RET for igual a [201, 202, 401, 731, 734, 738]. Não deve ser preenchido se o
       * código de categoria no RET for igual a [721, 722, 771, 901].
       *
       * @param natAtividade Valor para atribuir ao campo natAtividade
       * @return O próprio InfoTSVAlteracao para continuar populando outros campos
       */
      public InfoTSVAlteracao<T> setNatAtividade(String natAtividade) {
        if (!"1".equals(natAtividade) && !"2".equals(natAtividade))
          throw new RuntimeException(
              "Valor " + String.valueOf(natAtividade) + " inválido para o campo natAtividade");
        this.natAtividade = natAtividade;
        return this;
      }
      /**
       * Trabalho urbano
       *
       * @return O próprio InfoTSVAlteracao para continuar populando outros campos
       */
      public InfoTSVAlteracao<T> setNatAtividade_1() {
        this.natAtividade = "1";
        return this;
      }
      /**
       * Trabalho rural
       *
       * @return O próprio InfoTSVAlteracao para continuar populando outros campos
       */
      public InfoTSVAlteracao<T> setNatAtividade_2() {
        this.natAtividade = "2";
        return this;
      }

      /**
       * Informações complementares
       *
       * @return Conteúdo do campo infoComplementares
       */
      public InfoComplementares getInfoComplementares() {
        return this.infoComplementares;
      }

      /**
       * Informações complementares
       *
       * <p>DESCRICAO_COMPLETA:Grupo onde são fornecidas informações complementares, preenchidas
       * conforme a categoria do TSVE.
       *
       * <p>CONDICAO_GRUPO: O (de acordo com a condição dos grupos inferiores); OC (nos demais
       * casos)
       *
       * @return O objeto InfoComplementares para população dos campos filhos
       */
      public InfoComplementares<InfoTSVAlteracao<T>> setInfoComplementares() {
        if (this.infoComplementares == null) {
          this.infoComplementares = new InfoComplementares(this);
        }
        return this.infoComplementares;
      }

      public InfoTSVAlteracao(Object pai) {
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
       * Informações complementares
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cargoFuncao",
            "remuneracao",
            "infoDirigenteSindical",
            "infoTrabCedido",
            "infoMandElet",
            "infoEstagiario",
          })
      public static class InfoComplementares<T> {

        /** Cargo/Função ocupado pelo TSVE */
        private CargoFuncao cargoFuncao;

        /** Informações da remuneração e periodicidade de pagamento. */
        private Tipos.T_remuneracao remuneracao;

        /** Informações relativas ao dirigente sindical. */
        private InfoDirigenteSindical infoDirigenteSindical;

        /** Informações relativas ao trabalhador cedido/em exercício em outro órgão */
        private InfoTrabCedido infoTrabCedido;

        /** Informações relativas a servidor público exercente de mandato eletivo. */
        private InfoMandElet infoMandElet;

        /** Informações do estagiário. */
        private Tipos.T_infoEstagiario infoEstagiario;

        /**
         * Cargo/Função ocupado pelo TSVE
         *
         * @return Conteúdo do campo cargoFuncao
         */
        public CargoFuncao getCargoFuncao() {
          return this.cargoFuncao;
        }

        /**
         * Cargo/Função ocupado pelo TSVE
         *
         * <p>DESCRICAO_COMPLETA:Grupo que apresenta o cargo e/ou função ocupada pelo TSVE.
         *
         * <p>CONDICAO_GRUPO: OC (se o código de categoria no RET for igual a [901, 903, 904]); O
         * (nos demais casos)
         *
         * @return O objeto CargoFuncao para população dos campos filhos
         */
        public CargoFuncao<InfoComplementares<T>> setCargoFuncao() {
          if (this.cargoFuncao == null) {
            this.cargoFuncao = new CargoFuncao(this);
          }
          return this.cargoFuncao;
        }

        /**
         * Informações da remuneração e periodicidade de pagamento.
         *
         * @return Conteúdo do campo remuneracao
         */
        public Tipos.T_remuneracao getRemuneracao() {
          return this.remuneracao;
        }

        /**
         * Informações da remuneração e periodicidade de pagamento.
         *
         * <p>CONDICAO_GRUPO: O (se o código de categoria no RET for igual a [721, 722, 771]); OC
         * (nos demais casos)
         *
         * @return O objeto Tipos.T_remuneracao para população dos campos filhos
         */
        public Tipos.T_remuneracao<InfoComplementares<T>> setRemuneracao() {
          if (this.remuneracao == null) {
            this.remuneracao = new Tipos.T_remuneracao(this);
          }
          return this.remuneracao;
        }

        /**
         * Informações relativas ao dirigente sindical.
         *
         * @return Conteúdo do campo infoDirigenteSindical
         */
        public InfoDirigenteSindical getInfoDirigenteSindical() {
          return this.infoDirigenteSindical;
        }

        /**
         * Informações relativas ao dirigente sindical.
         *
         * <p>CONDICAO_GRUPO: O (se o código de categoria no RET for igual a [401]); N (nos demais
         * casos)
         *
         * @return O objeto InfoDirigenteSindical para população dos campos filhos
         */
        public InfoDirigenteSindical<InfoComplementares<T>> setInfoDirigenteSindical() {
          if (this.infoDirigenteSindical == null) {
            this.infoDirigenteSindical = new InfoDirigenteSindical(this);
          }
          return this.infoDirigenteSindical;
        }

        /**
         * Informações relativas ao trabalhador cedido/em exercício em outro órgão
         *
         * @return Conteúdo do campo infoTrabCedido
         */
        public InfoTrabCedido getInfoTrabCedido() {
          return this.infoTrabCedido;
        }

        /**
         * Informações relativas ao trabalhador cedido/em exercício em outro órgão
         *
         * <p>DESCRICAO_COMPLETA:Informações relativas ao trabalhador cedido/em exercício em outro
         * órgão, preenchidas exclusivamente pelo cessionário/órgão de destino.
         *
         * <p>CONDICAO_GRUPO: O (se o código de categoria no RET for igual a [410]); N (nos demais
         * casos)
         *
         * @return O objeto InfoTrabCedido para população dos campos filhos
         */
        public InfoTrabCedido<InfoComplementares<T>> setInfoTrabCedido() {
          if (this.infoTrabCedido == null) {
            this.infoTrabCedido = new InfoTrabCedido(this);
          }
          return this.infoTrabCedido;
        }

        /**
         * Informações relativas a servidor público exercente de mandato eletivo.
         *
         * @return Conteúdo do campo infoMandElet
         */
        public InfoMandElet getInfoMandElet() {
          return this.infoMandElet;
        }

        /**
         * Informações relativas a servidor público exercente de mandato eletivo.
         *
         * <p>CONDICAO_GRUPO: O (se o código de categoria no RET for igual a [304]); N (nos demais
         * casos)
         *
         * @return O objeto InfoMandElet para população dos campos filhos
         */
        public InfoMandElet<InfoComplementares<T>> setInfoMandElet() {
          if (this.infoMandElet == null) {
            this.infoMandElet = new InfoMandElet(this);
          }
          return this.infoMandElet;
        }

        /**
         * Informações do estagiário.
         *
         * @return Conteúdo do campo infoEstagiario
         */
        public Tipos.T_infoEstagiario getInfoEstagiario() {
          return this.infoEstagiario;
        }

        /**
         * Informações do estagiário.
         *
         * <p>CONDICAO_GRUPO: O (se o código de categoria no RET for igual a [901]); N (nos demais
         * casos)
         *
         * @return O objeto Tipos.T_infoEstagiario para população dos campos filhos
         */
        public Tipos.T_infoEstagiario<InfoComplementares<T>> setInfoEstagiario() {
          if (this.infoEstagiario == null) {
            this.infoEstagiario = new Tipos.T_infoEstagiario(this);
          }
          return this.infoEstagiario;
        }

        public InfoComplementares(Object pai) {
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
         * Cargo/Função ocupado pelo TSVE
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "nmCargo",
              "CBOCargo",
              "nmFuncao",
              "CBOFuncao",
            })
        public static class CargoFuncao<T> {

          /** Informar o nome do cargo. */
          private String nmCargo;

          /** Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo. */
          private String CBOCargo;

          /** Informar o nome da função de confiança. */
          private String nmFuncao;

          /** Informar a CBO relativa à função de confiança/cargo em comissão. */
          private String CBOFuncao;

          /**
           * Informar o nome do cargo.
           *
           * @return Conteúdo do campo nmCargo
           */
          public String getNmCargo() {
            return this.nmCargo;
          }

          /**
           * Informar o nome do cargo.
           *
           * <p>Validação: Preenchimento obrigatório se o código de categoria no RET for diferente
           * de [410].
           *
           * @param nmCargo Valor para atribuir ao campo nmCargo
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setNmCargo(String nmCargo) {
            this.nmCargo = nmCargo;
            return this;
          }

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
           * <p>Validação: Informação obrigatória e exclusiva se {nmCargo}(./nmCargo) for
           * preenchido. Se informado, deve ser um código válido e existente na tabela de CBO, com 6
           * (seis) posições.
           *
           * @param CBOCargo Valor para atribuir ao campo CBOCargo
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setCBOCargo(String CBOCargo) {
            this.CBOCargo = CBOCargo;
            return this;
          }

          /**
           * Informar o nome da função de confiança.
           *
           * @return Conteúdo do campo nmFuncao
           */
          public String getNmFuncao() {
            return this.nmFuncao;
          }

          /**
           * Informar o nome da função de confiança.
           *
           * <p>Validação: Preenchimento obrigatório se o código de categoria no RET for igual a
           * [410] e não houver informação de {nmCargo}(./nmCargo).
           *
           * @param nmFuncao Valor para atribuir ao campo nmFuncao
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setNmFuncao(String nmFuncao) {
            this.nmFuncao = nmFuncao;
            return this;
          }

          /**
           * Informar a CBO relativa à função de confiança/cargo em comissão.
           *
           * @return Conteúdo do campo CBOFuncao
           */
          public String getCBOFuncao() {
            return this.CBOFuncao;
          }

          /**
           * Informar a CBO relativa à função de confiança/cargo em comissão.
           *
           * <p>Validação: Informação obrigatória e exclusiva se {nmFuncao}(./nmFuncao) for
           * preenchido. Se informado, deve ser um código válido e existente na tabela de CBO, com 6
           * (seis) posições.
           *
           * @param CBOFuncao Valor para atribuir ao campo CBOFuncao
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setCBOFuncao(String CBOFuncao) {
            this.CBOFuncao = CBOFuncao;
            return this;
          }

          public CargoFuncao(Object pai) {
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
         * Informações relativas ao dirigente sindical.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpRegPrev",
            })
        public static class InfoDirigenteSindical<T> {

          /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
          private String tpRegPrev;

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @return Conteúdo do campo tpRegPrev
           */
          public String getTpRegPrev() {
            return this.tpRegPrev;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * <p>Validação: Se
           * {infoDirigenteSindical/categOrig}(2300_infoTSVInicio_infoComplementares_infoDirigenteSindical_categOrig)
           * do evento S-2300 for relativa a "Empregado", não pode ser preenchido com [2].
           *
           * @param tpRegPrev Valor para atribuir ao campo tpRegPrev
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev(String tpRegPrev) {
            if (!"1".equals(tpRegPrev) && !"2".equals(tpRegPrev) && !"3".equals(tpRegPrev))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegPrev) + " inválido para o campo tpRegPrev");
            this.tpRegPrev = tpRegPrev;
            return this;
          }
          /**
           * Regime Geral de Previdência Social - RGPS
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev_1() {
            this.tpRegPrev = "1";
            return this;
          }
          /**
           * Regime Próprio de Previdência Social - RPPS ou Sistema de Proteção Social dos Militares
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev_2() {
            this.tpRegPrev = "2";
            return this;
          }
          /**
           * Regime de Previdência Social no exterior
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev_3() {
            this.tpRegPrev = "3";
            return this;
          }

          public InfoDirigenteSindical(Object pai) {
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
         * Informações relativas ao trabalhador cedido/em exercício em outro órgão
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpRegPrev",
            })
        public static class InfoTrabCedido<T> {

          /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
          private String tpRegPrev;

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @return Conteúdo do campo tpRegPrev
           */
          public String getTpRegPrev() {
            return this.tpRegPrev;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * <p>Validação: Se
           * {infoTrabCedido/categOrig}(2300_infoTSVInicio_infoComplementares_infoTrabCedido_categOrig)
           * do evento S-2300 for relativa a "Empregado", não pode ser preenchido com [2].
           *
           * @param tpRegPrev Valor para atribuir ao campo tpRegPrev
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev(String tpRegPrev) {
            if (!"1".equals(tpRegPrev) && !"2".equals(tpRegPrev) && !"3".equals(tpRegPrev))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegPrev) + " inválido para o campo tpRegPrev");
            this.tpRegPrev = tpRegPrev;
            return this;
          }
          /**
           * Regime Geral de Previdência Social - RGPS
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev_1() {
            this.tpRegPrev = "1";
            return this;
          }
          /**
           * Regime Próprio de Previdência Social - RPPS ou Sistema de Proteção Social dos Militares
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev_2() {
            this.tpRegPrev = "2";
            return this;
          }
          /**
           * Regime de Previdência Social no exterior
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev_3() {
            this.tpRegPrev = "3";
            return this;
          }

          public InfoTrabCedido(Object pai) {
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
         * Informações relativas a servidor público exercente de mandato eletivo.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "indRemunCargo",
              "tpRegPrev",
            })
        public static class InfoMandElet<T> {

          /** Indicar se o servidor optou pela remuneração do cargo efetivo. */
          private String indRemunCargo;

          /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
          private String tpRegPrev;

          /**
           * Indicar se o servidor optou pela remuneração do cargo efetivo.
           *
           * @return Conteúdo do campo indRemunCargo
           */
          public String getIndRemunCargo() {
            return this.indRemunCargo;
          }

          /**
           * Indicar se o servidor optou pela remuneração do cargo efetivo.
           *
           * <p>Validação: Informação obrigatória e exclusiva se {CBOCargo}(../cargoFuncao_CBOCargo)
           * = [111120, 111250, 111255]).
           *
           * @param indRemunCargo Valor para atribuir ao campo indRemunCargo
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo(String indRemunCargo) {
            if (!"S".equals(indRemunCargo) && !"N".equals(indRemunCargo))
              throw new RuntimeException(
                  "Valor "
                      + String.valueOf(indRemunCargo)
                      + " inválido para o campo indRemunCargo");
            this.indRemunCargo = indRemunCargo;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo_S() {
            this.indRemunCargo = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo_N() {
            this.indRemunCargo = "N";
            return this;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @return Conteúdo do campo tpRegPrev
           */
          public String getTpRegPrev() {
            return this.tpRegPrev;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @param tpRegPrev Valor para atribuir ao campo tpRegPrev
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev(String tpRegPrev) {
            if (!"1".equals(tpRegPrev) && !"2".equals(tpRegPrev) && !"3".equals(tpRegPrev))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegPrev) + " inválido para o campo tpRegPrev");
            this.tpRegPrev = tpRegPrev;
            return this;
          }
          /**
           * Regime Geral de Previdência Social - RGPS
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev_1() {
            this.tpRegPrev = "1";
            return this;
          }
          /**
           * Regime Próprio de Previdência Social - RPPS ou Sistema de Proteção Social dos Militares
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev_2() {
            this.tpRegPrev = "2";
            return this;
          }
          /**
           * Regime de Previdência Social no exterior
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev_3() {
            this.tpRegPrev = "3";
            return this;
          }

          public InfoMandElet(Object pai) {
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
}
