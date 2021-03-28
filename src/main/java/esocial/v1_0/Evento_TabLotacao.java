package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1020 - Tabela de Lotações Tributárias */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtTabLotacao",
    })
@XmlRootElement(name = "eSocial")
public class Evento_TabLotacao {

  /** Evento Tabela de Lotações Tributárias. */
  private EvtTabLotacao evtTabLotacao;

  /**
   * Evento Tabela de Lotações Tributárias.
   *
   * @return Conteúdo do campo evtTabLotacao
   */
  public EvtTabLotacao getEvtTabLotacao() {
    return this.evtTabLotacao;
  }

  /**
   * Evento Tabela de Lotações Tributárias.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_TABGERAL_ALTERACAO_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_TABGERAL_EXISTE_REGISTRO_ALTERADO
   *
   * <p>REGRA:REGRA_TABGERAL_EXISTE_REGISTRO_EXCLUIDO
   *
   * <p>REGRA:REGRA_TABGERAL_INCLUSAO_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_TABLOTACAO_VALIDA_FPASTERCEIROS
   *
   * <p>REGRA:REGRA_TAB_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_FUTURA
   *
   * @return O objeto EvtTabLotacao para população dos campos filhos
   */
  public EvtTabLotacao<Evento_TabLotacao> setEvtTabLotacao() {
    if (this.evtTabLotacao == null) {
      this.evtTabLotacao = new EvtTabLotacao(this);
    }
    return this.evtTabLotacao;
  }

  /**
   * Evento Tabela de Lotações Tributárias.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoLotacao",
      })
  public static class EvtTabLotacao<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_evtTab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações da lotação */
    private InfoLotacao infoLotacao;

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
    public Tipos.T_ideEvento_evtTab<EvtTabLotacao<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtTabLotacao<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações da lotação
     *
     * @return Conteúdo do campo infoLotacao
     */
    public InfoLotacao getInfoLotacao() {
      return this.infoLotacao;
    }

    /**
     * Informações da lotação
     *
     * <p>DESCRICAO_COMPLETA:Identificação da operação (inclusão, alteração ou exclusão) e das
     * informações da lotação.
     *
     * @return O objeto InfoLotacao para população dos campos filhos
     */
    public InfoLotacao<EvtTabLotacao<T>> setInfoLotacao() {
      if (this.infoLotacao == null) {
        this.infoLotacao = new InfoLotacao(this);
      }
      return this.infoLotacao;
    }

    public EvtTabLotacao(Object pai) {
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
     * Informações da lotação
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
    public static class InfoLotacao<T> {

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
      public Inclusao<InfoLotacao<T>> setInclusao() {
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
      public Alteracao<InfoLotacao<T>> setAlteracao() {
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
      public Exclusao<InfoLotacao<T>> setExclusao() {
        if (this.exclusao == null) {
          this.exclusao = new Exclusao(this);
        }
        return this.exclusao;
      }

      public InfoLotacao(Object pai) {
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
            "ideLotacao",
            "dadosLotacao",
          })
      public static class Inclusao<T> {

        /** Identificação da lotação e validade das informações */
        private T_ideLotacao ideLotacao;

        /** Detalhamento das informações da lotação. */
        private T_dadosLotacao dadosLotacao;

        /**
         * Identificação da lotação e validade das informações
         *
         * @return Conteúdo do campo ideLotacao
         */
        public T_ideLotacao getIdeLotacao() {
          return this.ideLotacao;
        }

        /**
         * Identificação da lotação e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação da lotação e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {codLotacao}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideLotacao para população dos campos filhos
         */
        public T_ideLotacao<Inclusao<T>> setIdeLotacao() {
          if (this.ideLotacao == null) {
            this.ideLotacao = new T_ideLotacao(this);
          }
          return this.ideLotacao;
        }

        /**
         * Detalhamento das informações da lotação.
         *
         * @return Conteúdo do campo dadosLotacao
         */
        public T_dadosLotacao getDadosLotacao() {
          return this.dadosLotacao;
        }

        /**
         * Detalhamento das informações da lotação.
         *
         * @return O objeto T_dadosLotacao para população dos campos filhos
         */
        public T_dadosLotacao<Inclusao<T>> setDadosLotacao() {
          if (this.dadosLotacao == null) {
            this.dadosLotacao = new T_dadosLotacao(this);
          }
          return this.dadosLotacao;
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
            "ideLotacao",
            "dadosLotacao",
            "novaValidade",
          })
      public static class Alteracao<T> {

        /** Identificação da lotação e validade das informações */
        private T_ideLotacao ideLotacao;

        /** Detalhamento das informações da lotação. */
        private T_dadosLotacao dadosLotacao;

        /** Novo período de validade das informações. */
        private Tipos.T_novaValidade novaValidade;

        /**
         * Identificação da lotação e validade das informações
         *
         * @return Conteúdo do campo ideLotacao
         */
        public T_ideLotacao getIdeLotacao() {
          return this.ideLotacao;
        }

        /**
         * Identificação da lotação e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação da lotação e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {codLotacao}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideLotacao para população dos campos filhos
         */
        public T_ideLotacao<Alteracao<T>> setIdeLotacao() {
          if (this.ideLotacao == null) {
            this.ideLotacao = new T_ideLotacao(this);
          }
          return this.ideLotacao;
        }

        /**
         * Detalhamento das informações da lotação.
         *
         * @return Conteúdo do campo dadosLotacao
         */
        public T_dadosLotacao getDadosLotacao() {
          return this.dadosLotacao;
        }

        /**
         * Detalhamento das informações da lotação.
         *
         * @return O objeto T_dadosLotacao para população dos campos filhos
         */
        public T_dadosLotacao<Alteracao<T>> setDadosLotacao() {
          if (this.dadosLotacao == null) {
            this.dadosLotacao = new T_dadosLotacao(this);
          }
          return this.dadosLotacao;
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
            "ideLotacao",
          })
      public static class Exclusao<T> {

        /** Identificação da lotação e validade das informações */
        private T_ideLotacao ideLotacao;

        /**
         * Identificação da lotação e validade das informações
         *
         * @return Conteúdo do campo ideLotacao
         */
        public T_ideLotacao getIdeLotacao() {
          return this.ideLotacao;
        }

        /**
         * Identificação da lotação e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação da lotação e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {codLotacao}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideLotacao para população dos campos filhos
         */
        public T_ideLotacao<Exclusao<T>> setIdeLotacao() {
          if (this.ideLotacao == null) {
            this.ideLotacao = new T_ideLotacao(this);
          }
          return this.ideLotacao;
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
   * Identificação da lotação e validade das informações
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "codLotacao",
        "iniValid",
        "fimValid",
      })
  public static class T_ideLotacao<T> {

    /** Informar o código atribuído pelo empregador para a lotação tributária. */
    private String codLotacao;

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     */
    private String iniValid;

    /** Preencher com o mês e ano de término da validade das informações, se houver. */
    private String fimValid;

    /**
     * Informar o código atribuído pelo empregador para a lotação tributária.
     *
     * @return Conteúdo do campo codLotacao
     */
    public String getCodLotacao() {
      return this.codLotacao;
    }

    /**
     * Informar o código atribuído pelo empregador para a lotação tributária.
     *
     * <p>Validação: O código atribuído não pode conter a expressão 'eSocial' nas 7 primeiras
     * posições.
     *
     * <p>REGRA:REGRA_CARACTERE_ESPECIAL
     *
     * @param codLotacao Valor para atribuir ao campo codLotacao
     * @return O próprio T_ideLotacao para continuar populando outros campos
     */
    public T_ideLotacao<T> setCodLotacao(String codLotacao) {
      this.codLotacao = codLotacao;
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
     * @return O próprio T_ideLotacao para continuar populando outros campos
     */
    public T_ideLotacao<T> setIniValid(String iniValid) {
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
     * @return O próprio T_ideLotacao para continuar populando outros campos
     */
    public T_ideLotacao<T> setFimValid(String fimValid) {
      this.fimValid = fimValid;
      return this;
    }

    public T_ideLotacao(Object pai) {
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
   * Detalhamento das informações da lotação.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpLotacao",
        "tpInsc",
        "nrInsc",
        "fpasLotacao",
        "infoEmprParcial",
        "dadosOpPort",
      })
  public static class T_dadosLotacao<T> {

    /** Preencher com o código correspondente ao tipo de lotação. */
    private String tpLotacao;

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Preencher com o número de inscrição (CNPJ, CPF, CNO) ao qual pertence a lotação tributária.
     */
    private String nrInsc;

    /** Informações de FPAS e Terceiros relativos à lotação tributária. */
    private FpasLotacao fpasLotacao;

    /** Informação complementar de obra de construção civil */
    private InfoEmprParcial infoEmprParcial;

    /** Informações do operador portuário. */
    private DadosOpPort dadosOpPort;

    /**
     * Preencher com o código correspondente ao tipo de lotação.
     *
     * @return Conteúdo do campo tpLotacao
     */
    public String getTpLotacao() {
      return this.tpLotacao;
    }

    /**
     * Preencher com o código correspondente ao tipo de lotação.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 10, bem como compatível com a
     * classificação tributária indicada no evento S-1000, conforme Tabela 12.
     *
     * @param tpLotacao Valor para atribuir ao campo tpLotacao
     * @return O próprio T_dadosLotacao para continuar populando outros campos
     */
    public T_dadosLotacao<T> setTpLotacao(String tpLotacao) {
      this.tpLotacao = tpLotacao;
      return this;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @return Conteúdo do campo tpInsc
     */
    public String getTpInsc() {
      return this.tpInsc;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * <p>Validação: O campo não deve ser preenchido se {tpLotacao}(./tpLotacao) for igual a [01,
     * 10, 21, 24, 90, 91]. Nos demais casos, observar conteúdo exigido para o campo
     * {dadosLotacao/nrInsc}(./nrInsc), conforme Tabela 10.
     *
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_dadosLotacao para continuar populando outros campos
     */
    public T_dadosLotacao<T> setTpInsc(String tpInsc) {
      if (!"1".equals(tpInsc) && !"2".equals(tpInsc) && !"4".equals(tpInsc))
        throw new RuntimeException(
            "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
      this.tpInsc = tpInsc;
      return this;
    }
    /**
     * CNPJ
     *
     * @return O próprio T_dadosLotacao para continuar populando outros campos
     */
    public T_dadosLotacao<T> setTpInsc_1() {
      this.tpInsc = "1";
      return this;
    }
    /**
     * CPF
     *
     * @return O próprio T_dadosLotacao para continuar populando outros campos
     */
    public T_dadosLotacao<T> setTpInsc_2() {
      this.tpInsc = "2";
      return this;
    }
    /**
     * CNO
     *
     * @return O próprio T_dadosLotacao para continuar populando outros campos
     */
    public T_dadosLotacao<T> setTpInsc_4() {
      this.tpInsc = "4";
      return this;
    }

    /**
     * Preencher com o número de inscrição (CNPJ, CPF, CNO) ao qual pertence a lotação tributária.
     *
     * @return Conteúdo do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Preencher com o número de inscrição (CNPJ, CPF, CNO) ao qual pertence a lotação tributária.
     *
     * <p>Validação: a) Deve ser preenchido de acordo com o conteúdo exigido, conforme especificado
     * no campo {dadosLotacao/tpInsc}(./tpInsc) e na Tabela 10;
     *
     * <p>b) Deve ser um identificador válido, constante das bases da RFB.
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_dadosLotacao para continuar populando outros campos
     */
    public T_dadosLotacao<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    /**
     * Informações de FPAS e Terceiros relativos à lotação tributária.
     *
     * @return Conteúdo do campo fpasLotacao
     */
    public FpasLotacao getFpasLotacao() {
      return this.fpasLotacao;
    }

    /**
     * Informações de FPAS e Terceiros relativos à lotação tributária.
     *
     * @return O objeto FpasLotacao para população dos campos filhos
     */
    public FpasLotacao<T_dadosLotacao<T>> setFpasLotacao() {
      if (this.fpasLotacao == null) {
        this.fpasLotacao = new FpasLotacao(this);
      }
      return this.fpasLotacao;
    }

    /**
     * Informação complementar de obra de construção civil
     *
     * @return Conteúdo do campo infoEmprParcial
     */
    public InfoEmprParcial getInfoEmprParcial() {
      return this.infoEmprParcial;
    }

    /**
     * Informação complementar de obra de construção civil
     *
     * <p>DESCRICAO_COMPLETA:Informação complementar que apresenta identificação do contratante de
     * obra de construção civil sob regime de empreitada parcial ou subempreitada.
     *
     * <p>CONDICAO_GRUPO: O (se {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao) =
     * [02]); N (nos demais casos)
     *
     * @return O objeto InfoEmprParcial para população dos campos filhos
     */
    public InfoEmprParcial<T_dadosLotacao<T>> setInfoEmprParcial() {
      if (this.infoEmprParcial == null) {
        this.infoEmprParcial = new InfoEmprParcial(this);
      }
      return this.infoEmprParcial;
    }

    /**
     * Informações do operador portuário.
     *
     * @return Conteúdo do campo dadosOpPort
     */
    public DadosOpPort getDadosOpPort() {
      return this.dadosOpPort;
    }

    /**
     * Informações do operador portuário.
     *
     * <p>CONDICAO_GRUPO: O (se {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao) =
     * [08]); N (nos demais casos)
     *
     * @return O objeto DadosOpPort para população dos campos filhos
     */
    public DadosOpPort<T_dadosLotacao<T>> setDadosOpPort() {
      if (this.dadosOpPort == null) {
        this.dadosOpPort = new DadosOpPort(this);
      }
      return this.dadosOpPort;
    }

    public T_dadosLotacao(Object pai) {
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
     * Informações de FPAS e Terceiros relativos à lotação tributária.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "fpas",
          "codTercs",
          "codTercsSusp",
          "infoProcJudTerceiros",
        })
    public static class FpasLotacao<T> {

      /** Preencher com o código relativo ao FPAS. */
      private Integer fpas;

      /**
       * Preencher com o código de Terceiros, já considerando a existência de eventuais convênios
       * para recolhimento direto. Ex.: Se o contribuinte está enquadrado com FPAS [507], cujo
       * código cheio de Terceiros é [0079], se possuir convênio com SENAI deve informar o código
       * [0075].
       */
      private String codTercs;

      /**
       * Informar o código combinado dos Terceiros para os quais o recolhimento está suspenso em
       * virtude de processos judiciais. Ex.: Se o contribuinte possui decisões de processos para
       * suspensão de recolhimentos ao SESI (0008) e ao SEBRAE (0064), deve informar o código
       * combinado das duas entidades, ou seja, [0072].
       */
      private String codTercsSusp;

      /**
       * Informações de processos judiciais relativos às contribuições destinadas a Outras Entidades
       */
      private InfoProcJudTerceiros infoProcJudTerceiros;

      /**
       * Preencher com o código relativo ao FPAS.
       *
       * @return Conteúdo do campo fpas
       */
      public Integer getFpas() {
        return this.fpas;
      }

      /**
       * Preencher com o código relativo ao FPAS.
       *
       * <p>Validação: Deve ser um código FPAS válido, conforme Tabela 04.
       *
       * @param fpas Valor para atribuir ao campo fpas
       * @return O próprio FpasLotacao para continuar populando outros campos
       */
      public FpasLotacao<T> setFpas(Integer fpas) {
        this.fpas = fpas;
        return this;
      }

      /**
       * Preencher com o código de Terceiros, já considerando a existência de eventuais convênios
       * para recolhimento direto. Ex.: Se o contribuinte está enquadrado com FPAS [507], cujo
       * código cheio de Terceiros é [0079], se possuir convênio com SENAI deve informar o código
       * [0075].
       *
       * @return Conteúdo do campo codTercs
       */
      public String getCodTercs() {
        return this.codTercs;
      }

      /**
       * Preencher com o código de Terceiros, já considerando a existência de eventuais convênios
       * para recolhimento direto. Ex.: Se o contribuinte está enquadrado com FPAS [507], cujo
       * código cheio de Terceiros é [0079], se possuir convênio com SENAI deve informar o código
       * [0075].
       *
       * <p>Validação: Se a classificação tributária em S-1000 for igual a [01, 02, 03, 04],
       * informar [0000]. Nos demais casos, o código de Terceiros informado deve ser compatível com
       * o código de FPAS informado, conforme Tabela 04.
       *
       * @param codTercs Valor para atribuir ao campo codTercs
       * @return O próprio FpasLotacao para continuar populando outros campos
       */
      public FpasLotacao<T> setCodTercs(String codTercs) {
        this.codTercs = codTercs;
        return this;
      }

      /**
       * Informar o código combinado dos Terceiros para os quais o recolhimento está suspenso em
       * virtude de processos judiciais. Ex.: Se o contribuinte possui decisões de processos para
       * suspensão de recolhimentos ao SESI (0008) e ao SEBRAE (0064), deve informar o código
       * combinado das duas entidades, ou seja, [0072].
       *
       * @return Conteúdo do campo codTercsSusp
       */
      public String getCodTercsSusp() {
        return this.codTercsSusp;
      }

      /**
       * Informar o código combinado dos Terceiros para os quais o recolhimento está suspenso em
       * virtude de processos judiciais. Ex.: Se o contribuinte possui decisões de processos para
       * suspensão de recolhimentos ao SESI (0008) e ao SEBRAE (0064), deve informar o código
       * combinado das duas entidades, ou seja, [0072].
       *
       * <p>Validação: Deve ser um código consistente com a Tabela 04.
       *
       * <p>Deve haver um processo em
       * {procJudTerceiro}(1020_infoLotacao_inclusao_dadosLotacao_fpasLotacao_infoProcJudTerceiros_procJudTerceiro)
       * para cada código de Terceiro cujo recolhimento esteja suspenso.
       *
       * @param codTercsSusp Valor para atribuir ao campo codTercsSusp
       * @return O próprio FpasLotacao para continuar populando outros campos
       */
      public FpasLotacao<T> setCodTercsSusp(String codTercsSusp) {
        this.codTercsSusp = codTercsSusp;
        return this;
      }

      /**
       * Informações de processos judiciais relativos às contribuições destinadas a Outras Entidades
       *
       * @return Conteúdo do campo infoProcJudTerceiros
       */
      public InfoProcJudTerceiros getInfoProcJudTerceiros() {
        return this.infoProcJudTerceiros;
      }

      /**
       * Informações de processos judiciais relativos às contribuições destinadas a Outras Entidades
       *
       * <p>DESCRICAO_COMPLETA:Informações sobre a existência de processos judiciais, com
       * sentença/decisão favorável ao contribuinte, relativos às contribuições destinadas a Outras
       * Entidades e Fundos.
       *
       * <p>CONDICAO_GRUPO: O (se
       * {codTercsSusp}(1020_infoLotacao_inclusao_dadosLotacao_fpasLotacao_codTercsSusp) for
       * preenchido); N (nos demais casos)
       *
       * @return O objeto InfoProcJudTerceiros para população dos campos filhos
       */
      public InfoProcJudTerceiros<FpasLotacao<T>> setInfoProcJudTerceiros() {
        if (this.infoProcJudTerceiros == null) {
          this.infoProcJudTerceiros = new InfoProcJudTerceiros(this);
        }
        return this.infoProcJudTerceiros;
      }

      public FpasLotacao(Object pai) {
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
       * Informações de processos judiciais relativos às contribuições destinadas a Outras Entidades
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "procJudTerceiro",
          })
      public static class InfoProcJudTerceiros<T> {

        /**
         * Identificação do processo judicial.
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         */
        private java.util.List<ProcJudTerceiro> procJudTerceiro;

        /**
         * Identificação do processo judicial.
         *
         * @return Conteúdo do campo procJudTerceiro
         */
        public java.util.List<ProcJudTerceiro> getProcJudTerceiro() {
          return this.procJudTerceiro;
        }

        /**
         * Identificação do processo judicial.
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         *
         * <p>CHAVE_GRUPO: {codTerc}, {nrProcJud}
         *
         * @return O objeto ProcJudTerceiro para população dos campos filhos
         */
        public ProcJudTerceiro<InfoProcJudTerceiros<T>> setProcJudTerceiro_Next() {
          if (this.procJudTerceiro == null) {
            this.procJudTerceiro = new java.util.ArrayList<>();
          }
          ProcJudTerceiro toAdd = new ProcJudTerceiro(this);
          this.procJudTerceiro.add(toAdd);
          return toAdd;
        }

        public InfoProcJudTerceiros(Object pai) {
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
         * Identificação do processo judicial.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "codTerc",
              "nrProcJud",
              "codSusp",
            })
        public static class ProcJudTerceiro<T> {

          /** Informar o código de Terceiro. */
          private String codTerc;

          /**
           * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
           * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
           */
          private String nrProcJud;

          /** Código do indicativo da suspensão, atribuído pelo empregador em S-1070. */
          private Integer codSusp;

          /**
           * Informar o código de Terceiro.
           *
           * @return Conteúdo do campo codTerc
           */
          public String getCodTerc() {
            return this.codTerc;
          }

          /**
           * Informar o código de Terceiro.
           *
           * <p>Validação: Deve ser um código de Terceiro válido e compatível com o FPAS/Terceiros
           * informado no grupo superior, conforme Tabela 04.
           *
           * @param codTerc Valor para atribuir ao campo codTerc
           * @return O próprio ProcJudTerceiro para continuar populando outros campos
           */
          public ProcJudTerceiro<T> setCodTerc(String codTerc) {
            this.codTerc = codTerc;
            return this;
          }

          /**
           * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
           * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
           *
           * @return Conteúdo do campo nrProcJud
           */
          public String getNrProcJud() {
            return this.nrProcJud;
          }

          /**
           * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
           * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
           *
           * <p>Validação: Deve ser um número de processo judicial válido e existente na Tabela de
           * Processos (S-1070), com {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) =
           * [1].
           *
           * @param nrProcJud Valor para atribuir ao campo nrProcJud
           * @return O próprio ProcJudTerceiro para continuar populando outros campos
           */
          public ProcJudTerceiro<T> setNrProcJud(String nrProcJud) {
            this.nrProcJud = nrProcJud;
            return this;
          }

          /**
           * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
           *
           * @return Conteúdo do campo codSusp
           */
          public Integer getCodSusp() {
            return this.codSusp;
          }

          /**
           * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
           *
           * <p>Validação: A informação prestada deve estar de acordo com o que foi informado em
           * S-1070.
           *
           * @param codSusp Valor para atribuir ao campo codSusp
           * @return O próprio ProcJudTerceiro para continuar populando outros campos
           */
          public ProcJudTerceiro<T> setCodSusp(Integer codSusp) {
            this.codSusp = codSusp;
            return this;
          }

          public ProcJudTerceiro(Object pai) {
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
     * Informação complementar de obra de construção civil
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpInscContrat",
          "nrInscContrat",
          "tpInscProp",
          "nrInscProp",
        })
    public static class InfoEmprParcial<T> {

      /** Tipo de inscrição do contratante. */
      private String tpInscContrat;

      /** Número de inscrição (CNPJ/CPF) do contratante. */
      private String nrInscContrat;

      /** Tipo de inscrição do proprietário do CNO. */
      private String tpInscProp;

      /** Preencher com o número de inscrição (CNPJ/CPF) do proprietário do CNO. */
      private String nrInscProp;

      /**
       * Tipo de inscrição do contratante.
       *
       * @return Conteúdo do campo tpInscContrat
       */
      public String getTpInscContrat() {
        return this.tpInscContrat;
      }

      /**
       * Tipo de inscrição do contratante.
       *
       * @param tpInscContrat Valor para atribuir ao campo tpInscContrat
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setTpInscContrat(String tpInscContrat) {
        if (!"1".equals(tpInscContrat) && !"2".equals(tpInscContrat))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpInscContrat) + " inválido para o campo tpInscContrat");
        this.tpInscContrat = tpInscContrat;
        return this;
      }
      /**
       * CNPJ
       *
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setTpInscContrat_1() {
        this.tpInscContrat = "1";
        return this;
      }
      /**
       * CPF
       *
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setTpInscContrat_2() {
        this.tpInscContrat = "2";
        return this;
      }

      /**
       * Número de inscrição (CNPJ/CPF) do contratante.
       *
       * @return Conteúdo do campo nrInscContrat
       */
      public String getNrInscContrat() {
        return this.nrInscContrat;
      }

      /**
       * Número de inscrição (CNPJ/CPF) do contratante.
       *
       * <p>Validação: Deve ser um número de CNPJ ou CPF válido, conforme definido em
       * {tpInscContrat}(./tpInscContrat).
       *
       * @param nrInscContrat Valor para atribuir ao campo nrInscContrat
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setNrInscContrat(String nrInscContrat) {
        this.nrInscContrat = nrInscContrat;
        return this;
      }

      /**
       * Tipo de inscrição do proprietário do CNO.
       *
       * @return Conteúdo do campo tpInscProp
       */
      public String getTpInscProp() {
        return this.tpInscProp;
      }

      /**
       * Tipo de inscrição do proprietário do CNO.
       *
       * @param tpInscProp Valor para atribuir ao campo tpInscProp
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setTpInscProp(String tpInscProp) {
        if (!"1".equals(tpInscProp) && !"2".equals(tpInscProp))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpInscProp) + " inválido para o campo tpInscProp");
        this.tpInscProp = tpInscProp;
        return this;
      }
      /**
       * CNPJ
       *
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setTpInscProp_1() {
        this.tpInscProp = "1";
        return this;
      }
      /**
       * CPF
       *
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setTpInscProp_2() {
        this.tpInscProp = "2";
        return this;
      }

      /**
       * Preencher com o número de inscrição (CNPJ/CPF) do proprietário do CNO.
       *
       * @return Conteúdo do campo nrInscProp
       */
      public String getNrInscProp() {
        return this.nrInscProp;
      }

      /**
       * Preencher com o número de inscrição (CNPJ/CPF) do proprietário do CNO.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se {tpInscProp}(./tpInscProp) for
       * informado. Deve ser um número de CNPJ ou CPF válido, conforme indicado em
       * {tpInscProp}(./tpInscProp), e constar como responsável no cadastro do CNO.
       *
       * @param nrInscProp Valor para atribuir ao campo nrInscProp
       * @return O próprio InfoEmprParcial para continuar populando outros campos
       */
      public InfoEmprParcial<T> setNrInscProp(String nrInscProp) {
        this.nrInscProp = nrInscProp;
        return this;
      }

      public InfoEmprParcial(Object pai) {
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
     * Informações do operador portuário.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "aliqRat", "fap",
        })
    public static class DadosOpPort<T> {

      /**
       * Preencher com a alíquota definida na legislação vigente para a atividade (CNAE)
       * preponderante.
       */
      private String aliqRat;

      /** Fator Acidentário de Prevenção - FAP. */
      private Double fap;

      /**
       * Preencher com a alíquota definida na legislação vigente para a atividade (CNAE)
       * preponderante.
       *
       * @return Conteúdo do campo aliqRat
       */
      public String getAliqRat() {
        return this.aliqRat;
      }

      /**
       * Preencher com a alíquota definida na legislação vigente para a atividade (CNAE)
       * preponderante.
       *
       * @param aliqRat Valor para atribuir ao campo aliqRat
       * @return O próprio DadosOpPort para continuar populando outros campos
       */
      public DadosOpPort<T> setAliqRat(String aliqRat) {
        if (!"1".equals(aliqRat) && !"2".equals(aliqRat) && !"3".equals(aliqRat))
          throw new RuntimeException(
              "Valor " + String.valueOf(aliqRat) + " inválido para o campo aliqRat");
        this.aliqRat = aliqRat;
        return this;
      }

      public DadosOpPort<T> setAliqRat_1() {
        this.aliqRat = "1";
        return this;
      }

      public DadosOpPort<T> setAliqRat_2() {
        this.aliqRat = "2";
        return this;
      }

      public DadosOpPort<T> setAliqRat_3() {
        this.aliqRat = "3";
        return this;
      }

      /**
       * Fator Acidentário de Prevenção - FAP.
       *
       * @return Conteúdo do campo fap
       */
      public Double getFap() {
        return this.fap;
      }

      /**
       * Fator Acidentário de Prevenção - FAP.
       *
       * <p>Validação: Deve ser um número maior ou igual a 0,5000 e menor ou igual a 2,0000, de
       * acordo com o estabelecido pelo órgão governamental competente.
       *
       * @param fap Valor para atribuir ao campo fap
       * @return O próprio DadosOpPort para continuar populando outros campos
       */
      public DadosOpPort<T> setFap(Double fap) {
        this.fap = fap;
        return this;
      }

      public DadosOpPort(Object pai) {
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
