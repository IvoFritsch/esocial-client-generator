package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1070 - Tabela de Processos Administrativos/Judiciais */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtTabProcesso",
    })
@XmlRootElement(name = "eSocial")
public class Evento_TabProcesso {

  /** Evento Tabela de Processos */
  private EvtTabProcesso evtTabProcesso;

  /**
   * Evento Tabela de Processos
   *
   * @return Conteúdo do campo evtTabProcesso
   */
  public EvtTabProcesso getEvtTabProcesso() {
    return this.evtTabProcesso;
  }

  /**
   * Evento Tabela de Processos
   *
   * <p>DESCRICAO_COMPLETA:Evento Tabela de Processos Administrativos/Judiciais.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_PERMITE_ALT_EXCL_CODSUSP
   *
   * <p>REGRA:REGRA_TABGERAL_ALTERACAO_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_TABGERAL_EXISTE_REGISTRO_ALTERADO
   *
   * <p>REGRA:REGRA_TABGERAL_EXISTE_REGISTRO_EXCLUIDO
   *
   * <p>REGRA:REGRA_TABGERAL_INCLUSAO_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_TAB_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_FUTURA
   *
   * <p>REGRA:REGRA_VALIDA_PROCESSO
   *
   * @return O objeto EvtTabProcesso para população dos campos filhos
   */
  public EvtTabProcesso<Evento_TabProcesso> setEvtTabProcesso() {
    if (this.evtTabProcesso == null) {
      this.evtTabProcesso = new EvtTabProcesso(this);
    }
    return this.evtTabProcesso;
  }

  /**
   * Evento Tabela de Processos
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoProcesso",
      })
  public static class EvtTabProcesso<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_evtTab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações do processo. */
    private InfoProcesso infoProcesso;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_evtTab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_evtTab para população dos campos filhos
     */
    public Tipos.T_ideEvento_evtTab<EvtTabProcesso<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_evtTab(this);
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
    public Tipos.T_ideEmpregador<EvtTabProcesso<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações do processo.
     *
     * @return Conteúdo do campo infoProcesso
     */
    public InfoProcesso getInfoProcesso() {
      return this.infoProcesso;
    }

    /**
     * Informações do processo.
     *
     * @return O objeto InfoProcesso para população dos campos filhos
     */
    public InfoProcesso<EvtTabProcesso<T>> setInfoProcesso() {
      if (this.infoProcesso == null) {
        this.infoProcesso = new InfoProcesso(this);
      }
      return this.infoProcesso;
    }

    public EvtTabProcesso(Object pai) {
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
     * Informações do processo.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "inclusao",
          "alteracao",
          "exclusao",
        })
    public static class InfoProcesso<T> {

      /** Inclusão de novas informações. */
      private Inclusao inclusao;

      /** Alteração das informações. */
      private Alteracao alteracao;

      /** Exclusão das informações. */
      private Exclusao exclusao;

      /**
       * Inclusão de novas informações.
       *
       * @return Conteúdo do campo inclusao
       */
      public Inclusao getInclusao() {
        return this.inclusao;
      }

      /**
       * Inclusão de novas informações.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Inclusao para população dos campos filhos
       */
      public Inclusao<InfoProcesso<T>> setInclusao() {
        if (this.inclusao == null) {
          this.inclusao = new Inclusao(this);
        }
        return this.inclusao;
      }

      /**
       * Alteração das informações.
       *
       * @return Conteúdo do campo alteracao
       */
      public Alteracao getAlteracao() {
        return this.alteracao;
      }

      /**
       * Alteração das informações.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Alteracao para população dos campos filhos
       */
      public Alteracao<InfoProcesso<T>> setAlteracao() {
        if (this.alteracao == null) {
          this.alteracao = new Alteracao(this);
        }
        return this.alteracao;
      }

      /**
       * Exclusão das informações.
       *
       * @return Conteúdo do campo exclusao
       */
      public Exclusao getExclusao() {
        return this.exclusao;
      }

      /**
       * Exclusão das informações.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Exclusao para população dos campos filhos
       */
      public Exclusao<InfoProcesso<T>> setExclusao() {
        if (this.exclusao == null) {
          this.exclusao = new Exclusao(this);
        }
        return this.exclusao;
      }

      public InfoProcesso(Object pai) {
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
       * Inclusão de novas informações.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "ideProcesso",
            "dadosProc",
          })
      public static class Inclusao<T> {

        /** Identificação do processo e validade das informações */
        private T_ideProcesso ideProcesso;

        /** Dados do processo. */
        private T_dadosProc dadosProc;

        /**
         * Identificação do processo e validade das informações
         *
         * @return Conteúdo do campo ideProcesso
         */
        public T_ideProcesso getIdeProcesso() {
          return this.ideProcesso;
        }

        /**
         * Identificação do processo e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação do processo e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {tpProc}, {nrProc}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideProcesso para população dos campos filhos
         */
        public T_ideProcesso<Inclusao<T>> setIdeProcesso() {
          if (this.ideProcesso == null) {
            this.ideProcesso = new T_ideProcesso(this);
          }
          return this.ideProcesso;
        }

        /**
         * Dados do processo.
         *
         * @return Conteúdo do campo dadosProc
         */
        public T_dadosProc getDadosProc() {
          return this.dadosProc;
        }

        /**
         * Dados do processo.
         *
         * @return O objeto T_dadosProc para população dos campos filhos
         */
        public T_dadosProc<Inclusao<T>> setDadosProc() {
          if (this.dadosProc == null) {
            this.dadosProc = new T_dadosProc(this);
          }
          return this.dadosProc;
        }

        public Inclusao(Object pai) {
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
       * Alteração das informações.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "ideProcesso",
            "dadosProc",
            "novaValidade",
          })
      public static class Alteracao<T> {

        /** Identificação do processo e validade das informações */
        private T_ideProcesso ideProcesso;

        /** Dados do processo. */
        private T_dadosProc dadosProc;

        /** Novo período de validade das informações. */
        private Tipos.T_novaValidade novaValidade;

        /**
         * Identificação do processo e validade das informações
         *
         * @return Conteúdo do campo ideProcesso
         */
        public T_ideProcesso getIdeProcesso() {
          return this.ideProcesso;
        }

        /**
         * Identificação do processo e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação do processo e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {tpProc}, {nrProc}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideProcesso para população dos campos filhos
         */
        public T_ideProcesso<Alteracao<T>> setIdeProcesso() {
          if (this.ideProcesso == null) {
            this.ideProcesso = new T_ideProcesso(this);
          }
          return this.ideProcesso;
        }

        /**
         * Dados do processo.
         *
         * @return Conteúdo do campo dadosProc
         */
        public T_dadosProc getDadosProc() {
          return this.dadosProc;
        }

        /**
         * Dados do processo.
         *
         * @return O objeto T_dadosProc para população dos campos filhos
         */
        public T_dadosProc<Alteracao<T>> setDadosProc() {
          if (this.dadosProc == null) {
            this.dadosProc = new T_dadosProc(this);
          }
          return this.dadosProc;
        }

        /**
         * Novo período de validade das informações.
         *
         * @return Conteúdo do campo novaValidade
         */
        public Tipos.T_novaValidade getNovaValidade() {
          return this.novaValidade;
        }

        /**
         * Novo período de validade das informações.
         *
         * <p>DESCRICAO_COMPLETA:Informação preenchida exclusivamente em caso de alteração do
         * período de validade das informações, apresentando o novo período de validade.
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto Tipos.T_novaValidade para população dos campos filhos
         */
        public Tipos.T_novaValidade<Alteracao<T>> setNovaValidade() {
          if (this.novaValidade == null) {
            this.novaValidade = new Tipos.T_novaValidade(this);
          }
          return this.novaValidade;
        }

        public Alteracao(Object pai) {
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
       * Exclusão das informações.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "ideProcesso",
          })
      public static class Exclusao<T> {

        /** Identificação do processo e validade das informações */
        private T_ideProcesso ideProcesso;

        /**
         * Identificação do processo e validade das informações
         *
         * @return Conteúdo do campo ideProcesso
         */
        public T_ideProcesso getIdeProcesso() {
          return this.ideProcesso;
        }

        /**
         * Identificação do processo e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação do processo e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {tpProc}, {nrProc}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideProcesso para população dos campos filhos
         */
        public T_ideProcesso<Exclusao<T>> setIdeProcesso() {
          if (this.ideProcesso == null) {
            this.ideProcesso = new T_ideProcesso(this);
          }
          return this.ideProcesso;
        }

        public Exclusao(Object pai) {
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

  /**
   * Identificação do processo e validade das informações
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpProc",
        "nrProc",
        "iniValid",
        "fimValid",
      })
  public static class T_ideProcesso<T> {

    /** Preencher com o código correspondente ao tipo de processo. */
    private String tpProc;

    /**
     * Informar o número do processo administrativo/judicial de acordo com o tipo informado em
     * {tpProc}(./tpProc).
     */
    private String nrProc;

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     */
    private String iniValid;

    /** Preencher com o mês e ano de término da validade das informações, se houver. */
    private String fimValid;

    /**
     * Preencher com o código correspondente ao tipo de processo.
     *
     * @return Conteúdo do campo tpProc
     */
    public String getTpProc() {
      return this.tpProc;
    }

    /**
     * Preencher com o código correspondente ao tipo de processo.
     *
     * @param tpProc Valor para atribuir ao campo tpProc
     * @return O próprio T_ideProcesso para continuar populando outros campos
     */
    public T_ideProcesso<T> setTpProc(String tpProc) {
      if (!"1".equals(tpProc) && !"2".equals(tpProc) && !"4".equals(tpProc))
        throw new RuntimeException(
            "Valor " + String.valueOf(tpProc) + " inválido para o campo tpProc");
      this.tpProc = tpProc;
      return this;
    }
    /**
     * Administrativo
     *
     * @return O próprio T_ideProcesso para continuar populando outros campos
     */
    public T_ideProcesso<T> setTpProc_1() {
      this.tpProc = "1";
      return this;
    }
    /**
     * Judicial
     *
     * @return O próprio T_ideProcesso para continuar populando outros campos
     */
    public T_ideProcesso<T> setTpProc_2() {
      this.tpProc = "2";
      return this;
    }
    /**
     * Processo FAP de exercício anterior a 2019
     *
     * @return O próprio T_ideProcesso para continuar populando outros campos
     */
    public T_ideProcesso<T> setTpProc_4() {
      this.tpProc = "4";
      return this;
    }

    /**
     * Informar o número do processo administrativo/judicial de acordo com o tipo informado em
     * {tpProc}(./tpProc).
     *
     * @return Conteúdo do campo nrProc
     */
    public String getNrProc() {
      return this.nrProc;
    }

    /**
     * Informar o número do processo administrativo/judicial de acordo com o tipo informado em
     * {tpProc}(./tpProc).
     *
     * <p>Validação: Deve ser um número de processo válido e:
     *
     * <p>a) Se {tpProc}(./tpProc) = [1], deve possuir 17 (dezessete) ou 21 (vinte e um) algarismos;
     *
     * <p>b) Se {tpProc}(./tpProc) = [2], deve possuir 20 (vinte) algarismos;
     *
     * <p>c) Se {tpProc}(./tpProc) = [4], deve possuir 16 (dezesseis) algarismos.
     *
     * @param nrProc Valor para atribuir ao campo nrProc
     * @return O próprio T_ideProcesso para continuar populando outros campos
     */
    public T_ideProcesso<T> setNrProc(String nrProc) {
      this.nrProc = nrProc;
      return this;
    }

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     *
     * @return Conteúdo do campo iniValid
     */
    public String getIniValid() {
      return this.iniValid;
    }

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     *
     * <p>Validação: Deve ser uma data válida, igual ou posterior à data de início de
     * obrigatoriedade deste evento para o empregador no eSocial, no formato AAAA-MM.
     *
     * @param iniValid Valor para atribuir ao campo iniValid
     * @return O próprio T_ideProcesso para continuar populando outros campos
     */
    public T_ideProcesso<T> setIniValid(String iniValid) {
      this.iniValid = iniValid;
      return this;
    }

    /**
     * Preencher com o mês e ano de término da validade das informações, se houver.
     *
     * @return Conteúdo do campo fimValid
     */
    public String getFimValid() {
      return this.fimValid;
    }

    /**
     * Preencher com o mês e ano de término da validade das informações, se houver.
     *
     * <p>Validação: Se informado, deve estar no formato AAAA-MM e ser um período igual ou posterior
     * a {iniValid}(./iniValid).
     *
     * @param fimValid Valor para atribuir ao campo fimValid
     * @return O próprio T_ideProcesso para continuar populando outros campos
     */
    public T_ideProcesso<T> setFimValid(String fimValid) {
      this.fimValid = fimValid;
      return this;
    }

    public T_ideProcesso(Object pai) {
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
   * Dados do processo.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indAutoria",
        "indMatProc",
        "observacao",
        "dadosProcJud",
        "infoSusp",
      })
  public static class T_dadosProc<T> {

    /** Indicativo da autoria da ação judicial. */
    private String indAutoria;

    /** Indicativo da matéria do processo. */
    private String indMatProc;

    /** Observações relacionadas ao processo. */
    private String observacao;

    /** Informações complementares do processo judicial. */
    private DadosProcJud dadosProcJud;

    /**
     * Informações de suspensão de exigibilidade de tributos
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     */
    private java.util.List<InfoSusp> infoSusp;

    /**
     * Indicativo da autoria da ação judicial.
     *
     * @return Conteúdo do campo indAutoria
     */
    public String getIndAutoria() {
      return this.indAutoria;
    }

    /**
     * Indicativo da autoria da ação judicial.
     *
     * <p>Validação: Preenchimento obrigatório se
     * {tpProc}(1070_infoProcesso_inclusao_ideProcesso_tpProc) = [2].
     *
     * @param indAutoria Valor para atribuir ao campo indAutoria
     * @return O próprio T_dadosProc para continuar populando outros campos
     */
    public T_dadosProc<T> setIndAutoria(String indAutoria) {
      if (!"1".equals(indAutoria) && !"2".equals(indAutoria))
        throw new RuntimeException(
            "Valor " + String.valueOf(indAutoria) + " inválido para o campo indAutoria");
      this.indAutoria = indAutoria;
      return this;
    }
    /**
     * Próprio contribuinte
     *
     * @return O próprio T_dadosProc para continuar populando outros campos
     */
    public T_dadosProc<T> setIndAutoria_1() {
      this.indAutoria = "1";
      return this;
    }
    /**
     * Outra entidade, empresa ou empregado
     *
     * @return O próprio T_dadosProc para continuar populando outros campos
     */
    public T_dadosProc<T> setIndAutoria_2() {
      this.indAutoria = "2";
      return this;
    }

    /**
     * Indicativo da matéria do processo.
     *
     * @return Conteúdo do campo indMatProc
     */
    public String getIndMatProc() {
      return this.indMatProc;
    }

    /**
     * Indicativo da matéria do processo.
     *
     * @param indMatProc Valor para atribuir ao campo indMatProc
     * @return O próprio T_dadosProc para continuar populando outros campos
     */
    public T_dadosProc<T> setIndMatProc(String indMatProc) {
      if (!"1".equals(indMatProc) && !"7".equals(indMatProc))
        throw new RuntimeException(
            "Valor " + String.valueOf(indMatProc) + " inválido para o campo indMatProc");
      this.indMatProc = indMatProc;
      return this;
    }
    /**
     * Exclusivamente tributária ou tributária e FGTS
     *
     * @return O próprio T_dadosProc para continuar populando outros campos
     */
    public T_dadosProc<T> setIndMatProc_1() {
      this.indMatProc = "1";
      return this;
    }
    /**
     * Exclusivamente FGTS e/ou Contribuição Social Rescisória (Lei Complementar 110/2001)
     *
     * @return O próprio T_dadosProc para continuar populando outros campos
     */
    public T_dadosProc<T> setIndMatProc_7() {
      this.indMatProc = "7";
      return this;
    }

    /**
     * Observações relacionadas ao processo.
     *
     * @return Conteúdo do campo observacao
     */
    public String getObservacao() {
      return this.observacao;
    }

    /**
     * Observações relacionadas ao processo.
     *
     * @param observacao Valor para atribuir ao campo observacao
     * @return O próprio T_dadosProc para continuar populando outros campos
     */
    public T_dadosProc<T> setObservacao(String observacao) {
      this.observacao = observacao;
      return this;
    }

    /**
     * Informações complementares do processo judicial.
     *
     * @return Conteúdo do campo dadosProcJud
     */
    public DadosProcJud getDadosProcJud() {
      return this.dadosProcJud;
    }

    /**
     * Informações complementares do processo judicial.
     *
     * <p>CONDICAO_GRUPO: O (se {tpProc}(1070_infoProcesso_inclusao_ideProcesso_tpProc) = [2] e
     * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1]); N (nos demais casos)
     *
     * @return O objeto DadosProcJud para população dos campos filhos
     */
    public DadosProcJud<T_dadosProc<T>> setDadosProcJud() {
      if (this.dadosProcJud == null) {
        this.dadosProcJud = new DadosProcJud(this);
      }
      return this.dadosProcJud;
    }

    /**
     * Informações de suspensão de exigibilidade de tributos
     *
     * @return Conteúdo do campo infoSusp
     */
    public java.util.List<InfoSusp> getInfoSusp() {
      return this.infoSusp;
    }

    /**
     * Informações de suspensão de exigibilidade de tributos
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     *
     * <p>DESCRICAO_COMPLETA:Informações de suspensão de exigibilidade de tributos em virtude de
     * processo administrativo ou judicial.
     *
     * <p>CHAVE_GRUPO: {codSusp}
     *
     * <p>CONDICAO_GRUPO: O (se {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) =
     * [1]); N (nos demais casos)
     *
     * @return O objeto InfoSusp para população dos campos filhos
     */
    public InfoSusp<T_dadosProc<T>> setInfoSusp_Next() {
      if (this.infoSusp == null) {
        this.infoSusp = new java.util.ArrayList<>();
      }
      InfoSusp toAdd = new InfoSusp(this);
      this.infoSusp.add(toAdd);
      return toAdd;
    }

    public T_dadosProc(Object pai) {
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
     * Informações complementares do processo judicial.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "ufVara",
          "codMunic",
          "idVara",
        })
    public static class DadosProcJud<T> {

      /** Identificação da Unidade da Federação - UF da Seção Judiciária. */
      private String ufVara;

      /** Preencher com o código do município, conforme tabela do IBGE. */
      private Integer codMunic;

      /** Código de identificação da Vara. */
      private Integer idVara;

      /**
       * Identificação da Unidade da Federação - UF da Seção Judiciária.
       *
       * @return Conteúdo do campo ufVara
       */
      public String getUfVara() {
        return this.ufVara;
      }

      /**
       * Identificação da Unidade da Federação - UF da Seção Judiciária.
       *
       * @param ufVara Valor para atribuir ao campo ufVara
       * @return O próprio DadosProcJud para continuar populando outros campos
       */
      public DadosProcJud<T> setUfVara(String ufVara) {
        if (!"AC".equals(ufVara)
            && !"AL".equals(ufVara)
            && !"AP".equals(ufVara)
            && !"AM".equals(ufVara)
            && !"BA".equals(ufVara)
            && !"CE".equals(ufVara)
            && !"DF".equals(ufVara)
            && !"ES".equals(ufVara)
            && !"GO".equals(ufVara)
            && !"MA".equals(ufVara)
            && !"MT".equals(ufVara)
            && !"MS".equals(ufVara)
            && !"MG".equals(ufVara)
            && !"PA".equals(ufVara)
            && !"PB".equals(ufVara)
            && !"PR".equals(ufVara)
            && !"PE".equals(ufVara)
            && !"PI".equals(ufVara)
            && !"RJ".equals(ufVara)
            && !"RN".equals(ufVara)
            && !"RS".equals(ufVara)
            && !"RO".equals(ufVara)
            && !"RR".equals(ufVara)
            && !"SC".equals(ufVara)
            && !"SP".equals(ufVara)
            && !"SE".equals(ufVara)
            && !"TO".equals(ufVara))
          throw new RuntimeException(
              "Valor " + String.valueOf(ufVara) + " inválido para o campo ufVara");
        this.ufVara = ufVara;
        return this;
      }

      public DadosProcJud<T> setUfVara_AC() {
        this.ufVara = "AC";
        return this;
      }

      public DadosProcJud<T> setUfVara_AL() {
        this.ufVara = "AL";
        return this;
      }

      public DadosProcJud<T> setUfVara_AP() {
        this.ufVara = "AP";
        return this;
      }

      public DadosProcJud<T> setUfVara_AM() {
        this.ufVara = "AM";
        return this;
      }

      public DadosProcJud<T> setUfVara_BA() {
        this.ufVara = "BA";
        return this;
      }

      public DadosProcJud<T> setUfVara_CE() {
        this.ufVara = "CE";
        return this;
      }

      public DadosProcJud<T> setUfVara_DF() {
        this.ufVara = "DF";
        return this;
      }

      public DadosProcJud<T> setUfVara_ES() {
        this.ufVara = "ES";
        return this;
      }

      public DadosProcJud<T> setUfVara_GO() {
        this.ufVara = "GO";
        return this;
      }

      public DadosProcJud<T> setUfVara_MA() {
        this.ufVara = "MA";
        return this;
      }

      public DadosProcJud<T> setUfVara_MT() {
        this.ufVara = "MT";
        return this;
      }

      public DadosProcJud<T> setUfVara_MS() {
        this.ufVara = "MS";
        return this;
      }

      public DadosProcJud<T> setUfVara_MG() {
        this.ufVara = "MG";
        return this;
      }

      public DadosProcJud<T> setUfVara_PA() {
        this.ufVara = "PA";
        return this;
      }

      public DadosProcJud<T> setUfVara_PB() {
        this.ufVara = "PB";
        return this;
      }

      public DadosProcJud<T> setUfVara_PR() {
        this.ufVara = "PR";
        return this;
      }

      public DadosProcJud<T> setUfVara_PE() {
        this.ufVara = "PE";
        return this;
      }

      public DadosProcJud<T> setUfVara_PI() {
        this.ufVara = "PI";
        return this;
      }

      public DadosProcJud<T> setUfVara_RJ() {
        this.ufVara = "RJ";
        return this;
      }

      public DadosProcJud<T> setUfVara_RN() {
        this.ufVara = "RN";
        return this;
      }

      public DadosProcJud<T> setUfVara_RS() {
        this.ufVara = "RS";
        return this;
      }

      public DadosProcJud<T> setUfVara_RO() {
        this.ufVara = "RO";
        return this;
      }

      public DadosProcJud<T> setUfVara_RR() {
        this.ufVara = "RR";
        return this;
      }

      public DadosProcJud<T> setUfVara_SC() {
        this.ufVara = "SC";
        return this;
      }

      public DadosProcJud<T> setUfVara_SP() {
        this.ufVara = "SP";
        return this;
      }

      public DadosProcJud<T> setUfVara_SE() {
        this.ufVara = "SE";
        return this;
      }

      public DadosProcJud<T> setUfVara_TO() {
        this.ufVara = "TO";
        return this;
      }

      /**
       * Preencher com o código do município, conforme tabela do IBGE.
       *
       * @return Conteúdo do campo codMunic
       */
      public Integer getCodMunic() {
        return this.codMunic;
      }

      /**
       * Preencher com o código do município, conforme tabela do IBGE.
       *
       * <p>Validação: Deve ser um código válido e existente na tabela do IBGE.
       *
       * @param codMunic Valor para atribuir ao campo codMunic
       * @return O próprio DadosProcJud para continuar populando outros campos
       */
      public DadosProcJud<T> setCodMunic(Integer codMunic) {
        this.codMunic = codMunic;
        return this;
      }

      /**
       * Código de identificação da Vara.
       *
       * @return Conteúdo do campo idVara
       */
      public Integer getIdVara() {
        return this.idVara;
      }

      /**
       * Código de identificação da Vara.
       *
       * @param idVara Valor para atribuir ao campo idVara
       * @return O próprio DadosProcJud para continuar populando outros campos
       */
      public DadosProcJud<T> setIdVara(Integer idVara) {
        this.idVara = idVara;
        return this;
      }

      public DadosProcJud(Object pai) {
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
     * Informações de suspensão de exigibilidade de tributos
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "codSusp",
          "indSusp",
          "dtDecisao",
          "indDeposito",
        })
    public static class InfoSusp<T> {

      /** Código do indicativo da suspensão, atribuído pelo empregador. */
      private Integer codSusp;

      /** Indicativo de suspensão da exigibilidade. */
      private String indSusp;

      /** Data da decisão, sentença ou despacho administrativo. */
      private javax.xml.datatype.XMLGregorianCalendar dtDecisao;

      /** Indicativo de depósito do montante integral. */
      private String indDeposito;

      /**
       * Código do indicativo da suspensão, atribuído pelo empregador.
       *
       * @return Conteúdo do campo codSusp
       */
      public Integer getCodSusp() {
        return this.codSusp;
      }

      /**
       * Código do indicativo da suspensão, atribuído pelo empregador.
       *
       * @param codSusp Valor para atribuir ao campo codSusp
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setCodSusp(Integer codSusp) {
        this.codSusp = codSusp;
        return this;
      }

      /**
       * Indicativo de suspensão da exigibilidade.
       *
       * @return Conteúdo do campo indSusp
       */
      public String getIndSusp() {
        return this.indSusp;
      }

      /**
       * Indicativo de suspensão da exigibilidade.
       *
       * <p>Validação: Se {tpProc}(1070_infoProcesso_inclusao_ideProcesso_tpProc) = [1], deve ser
       * preenchido com [03, 14, 92].
       *
       * <p>Se {tpProc}(1070_infoProcesso_inclusao_ideProcesso_tpProc) = [2], deve ser preenchido
       * com [01, 02, 04, 05, 08, 09, 10, 11, 12, 13, 90, 92].
       *
       * <p>Se {tpProc}(1070_infoProcesso_inclusao_ideProcesso_tpProc) = [4], deve ser preenchido
       * com [14].
       *
       * @param indSusp Valor para atribuir ao campo indSusp
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp(String indSusp) {
        if (!"01".equals(indSusp)
            && !"02".equals(indSusp)
            && !"03".equals(indSusp)
            && !"04".equals(indSusp)
            && !"05".equals(indSusp)
            && !"08".equals(indSusp)
            && !"09".equals(indSusp)
            && !"10".equals(indSusp)
            && !"11".equals(indSusp)
            && !"12".equals(indSusp)
            && !"13".equals(indSusp)
            && !"14".equals(indSusp)
            && !"90".equals(indSusp)
            && !"92".equals(indSusp))
          throw new RuntimeException(
              "Valor " + String.valueOf(indSusp) + " inválido para o campo indSusp");
        this.indSusp = indSusp;
        return this;
      }
      /**
       * Liminar em mandado de segurança
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_01() {
        this.indSusp = "01";
        return this;
      }
      /**
       * Depósito judicial do montante integral
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_02() {
        this.indSusp = "02";
        return this;
      }
      /**
       * Depósito administrativo do montante integral
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_03() {
        this.indSusp = "03";
        return this;
      }
      /**
       * Antecipação de tutela
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_04() {
        this.indSusp = "04";
        return this;
      }
      /**
       * Liminar em medida cautelar
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_05() {
        this.indSusp = "05";
        return this;
      }
      /**
       * Sentença em mandado de segurança favorável ao contribuinte
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_08() {
        this.indSusp = "08";
        return this;
      }
      /**
       * Sentença em ação ordinária favorável ao contribuinte e confirmada pelo TRF
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_09() {
        this.indSusp = "09";
        return this;
      }
      /**
       * Acórdão do TRF favorável ao contribuinte
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_10() {
        this.indSusp = "10";
        return this;
      }
      /**
       * Acórdão do STJ em recurso especial favorável ao contribuinte
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_11() {
        this.indSusp = "11";
        return this;
      }
      /**
       * Acórdão do STF em recurso extraordinário favorável ao contribuinte
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_12() {
        this.indSusp = "12";
        return this;
      }
      /**
       * Sentença 1ª instância não transitada em julgado com efeito suspensivo
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_13() {
        this.indSusp = "13";
        return this;
      }
      /**
       * Contestação administrativa FAP
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_14() {
        this.indSusp = "14";
        return this;
      }
      /**
       * Decisão definitiva a favor do contribuinte
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_90() {
        this.indSusp = "90";
        return this;
      }
      /**
       * Sem suspensão da exigibilidade
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndSusp_92() {
        this.indSusp = "92";
        return this;
      }

      /**
       * Data da decisão, sentença ou despacho administrativo.
       *
       * @return Conteúdo do campo dtDecisao
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtDecisao() {
        return this.dtDecisao;
      }

      /**
       * Data da decisão, sentença ou despacho administrativo.
       *
       * @param dtDecisao Valor para atribuir ao campo dtDecisao
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setDtDecisao(javax.xml.datatype.XMLGregorianCalendar dtDecisao) {
        this.dtDecisao = dtDecisao;
        return this;
      }

      /**
       * Indicativo de depósito do montante integral.
       *
       * @return Conteúdo do campo indDeposito
       */
      public String getIndDeposito() {
        return this.indDeposito;
      }

      /**
       * Indicativo de depósito do montante integral.
       *
       * <p>Validação: Se {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) = [90],
       * preencher obrigatoriamente com [N].
       *
       * <p>Se {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) = [02, 03] preencher
       * obrigatoriamente com [S].
       *
       * @param indDeposito Valor para atribuir ao campo indDeposito
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndDeposito(String indDeposito) {
        if (!"S".equals(indDeposito) && !"N".equals(indDeposito))
          throw new RuntimeException(
              "Valor " + String.valueOf(indDeposito) + " inválido para o campo indDeposito");
        this.indDeposito = indDeposito;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndDeposito_S() {
        this.indDeposito = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio InfoSusp para continuar populando outros campos
       */
      public InfoSusp<T> setIndDeposito_N() {
        this.indDeposito = "N";
        return this;
      }

      public InfoSusp(Object pai) {
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
