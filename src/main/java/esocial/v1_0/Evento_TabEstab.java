package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1005 - Tabela de Estabelecimentos, Obras ou Unidades de Órgãos Públicos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtTabEstab",
    })
@XmlRootElement(name = "eSocial")
public class Evento_TabEstab {

  /** Evento Tabela de Estabelecimentos */
  private EvtTabEstab evtTabEstab;

  /**
   * Evento Tabela de Estabelecimentos
   *
   * @return Conteúdo do campo evtTabEstab
   */
  public EvtTabEstab getEvtTabEstab() {
    return this.evtTabEstab;
  }

  /**
   * Evento Tabela de Estabelecimentos
   *
   * <p>DESCRICAO_COMPLETA:Evento Tabela de Estabelecimentos, Obras ou Unidades de Órgãos Públicos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_TABESTAB_VALIDA_ESTABELECIMENTO
   *
   * <p>REGRA:REGRA_TABESTAB_VALIDA_INFO_CNO
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
   * @return O objeto EvtTabEstab para população dos campos filhos
   */
  public EvtTabEstab<Evento_TabEstab> setEvtTabEstab() {
    if (this.evtTabEstab == null) {
      this.evtTabEstab = new EvtTabEstab(this);
    }
    return this.evtTabEstab;
  }

  /**
   * Evento Tabela de Estabelecimentos
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoEstab",
      })
  public static class EvtTabEstab<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_evtTab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações do estabelecimento. */
    private InfoEstab infoEstab;

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
    public Tipos.T_ideEvento_evtTab<EvtTabEstab<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtTabEstab<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações do estabelecimento.
     *
     * @return Conteúdo do campo infoEstab
     */
    public InfoEstab getInfoEstab() {
      return this.infoEstab;
    }

    /**
     * Informações do estabelecimento.
     *
     * @return O objeto InfoEstab para população dos campos filhos
     */
    public InfoEstab<EvtTabEstab<T>> setInfoEstab() {
      if (this.infoEstab == null) {
        this.infoEstab = new InfoEstab(this);
      }
      return this.infoEstab;
    }

    public EvtTabEstab(Object pai) {
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
     * Informações do estabelecimento.
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
    public static class InfoEstab<T> {

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
      public Inclusao<InfoEstab<T>> setInclusao() {
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
      public Alteracao<InfoEstab<T>> setAlteracao() {
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
      public Exclusao<InfoEstab<T>> setExclusao() {
        if (this.exclusao == null) {
          this.exclusao = new Exclusao(this);
        }
        return this.exclusao;
      }

      public InfoEstab(Object pai) {
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
            "ideEstab",
            "dadosEstab",
          })
      public static class Inclusao<T> {

        /** Identificação do estabelecimento e validade das informações */
        private T_ideEstab ideEstab;

        /** Detalhamento das informações do estabelecimento */
        private T_dadosEstab dadosEstab;

        /**
         * Identificação do estabelecimento e validade das informações
         *
         * @return Conteúdo do campo ideEstab
         */
        public T_ideEstab getIdeEstab() {
          return this.ideEstab;
        }

        /**
         * Identificação do estabelecimento e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento, obra de construção civil ou
         * unidade de órgão público e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideEstab para população dos campos filhos
         */
        public T_ideEstab<Inclusao<T>> setIdeEstab() {
          if (this.ideEstab == null) {
            this.ideEstab = new T_ideEstab(this);
          }
          return this.ideEstab;
        }

        /**
         * Detalhamento das informações do estabelecimento
         *
         * @return Conteúdo do campo dadosEstab
         */
        public T_dadosEstab getDadosEstab() {
          return this.dadosEstab;
        }

        /**
         * Detalhamento das informações do estabelecimento
         *
         * <p>DESCRICAO_COMPLETA:Detalhamento das informações do estabelecimento, obra de construção
         * civil ou unidade de órgão público.
         *
         * @return O objeto T_dadosEstab para população dos campos filhos
         */
        public T_dadosEstab<Inclusao<T>> setDadosEstab() {
          if (this.dadosEstab == null) {
            this.dadosEstab = new T_dadosEstab(this);
          }
          return this.dadosEstab;
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
            "ideEstab",
            "dadosEstab",
            "novaValidade",
          })
      public static class Alteracao<T> {

        /** Identificação do estabelecimento e validade das informações */
        private T_ideEstab ideEstab;

        /** Detalhamento das informações do estabelecimento */
        private T_dadosEstab dadosEstab;

        /** Novo período de validade das informações. */
        private Tipos.T_novaValidade novaValidade;

        /**
         * Identificação do estabelecimento e validade das informações
         *
         * @return Conteúdo do campo ideEstab
         */
        public T_ideEstab getIdeEstab() {
          return this.ideEstab;
        }

        /**
         * Identificação do estabelecimento e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento, obra de construção civil ou
         * unidade de órgão público e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideEstab para população dos campos filhos
         */
        public T_ideEstab<Alteracao<T>> setIdeEstab() {
          if (this.ideEstab == null) {
            this.ideEstab = new T_ideEstab(this);
          }
          return this.ideEstab;
        }

        /**
         * Detalhamento das informações do estabelecimento
         *
         * @return Conteúdo do campo dadosEstab
         */
        public T_dadosEstab getDadosEstab() {
          return this.dadosEstab;
        }

        /**
         * Detalhamento das informações do estabelecimento
         *
         * <p>DESCRICAO_COMPLETA:Detalhamento das informações do estabelecimento, obra de construção
         * civil ou unidade de órgão público.
         *
         * @return O objeto T_dadosEstab para população dos campos filhos
         */
        public T_dadosEstab<Alteracao<T>> setDadosEstab() {
          if (this.dadosEstab == null) {
            this.dadosEstab = new T_dadosEstab(this);
          }
          return this.dadosEstab;
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
            "ideEstab",
          })
      public static class Exclusao<T> {

        /** Identificação do estabelecimento e validade das informações */
        private T_ideEstab ideEstab;

        /**
         * Identificação do estabelecimento e validade das informações
         *
         * @return Conteúdo do campo ideEstab
         */
        public T_ideEstab getIdeEstab() {
          return this.ideEstab;
        }

        /**
         * Identificação do estabelecimento e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento, obra de construção civil ou
         * unidade de órgão público e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideEstab para população dos campos filhos
         */
        public T_ideEstab<Exclusao<T>> setIdeEstab() {
          if (this.ideEstab == null) {
            this.ideEstab = new T_ideEstab(this);
          }
          return this.ideEstab;
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
   * Identificação do estabelecimento e validade das informações
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc",
        "nrInsc",
        "iniValid",
        "fimValid",
      })
  public static class T_ideEstab<T> {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do estabelecimento, obra de construção civil ou órgão público
     * de acordo com o tipo de inscrição indicado no campo {ideEstab/tpInsc}(./tpInsc).
     */
    private String nrInsc;

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     */
    private String iniValid;

    /** Preencher com o mês e ano de término da validade das informações, se houver. */
    private String fimValid;

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
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setTpInsc(String tpInsc) {
      if (!"1".equals(tpInsc) && !"3".equals(tpInsc) && !"4".equals(tpInsc))
        throw new RuntimeException(
            "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
      this.tpInsc = tpInsc;
      return this;
    }
    /**
     * CNPJ
     *
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setTpInsc_1() {
      this.tpInsc = "1";
      return this;
    }
    /**
     * CAEPF
     *
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setTpInsc_3() {
      this.tpInsc = "3";
      return this;
    }
    /**
     * CNO
     *
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setTpInsc_4() {
      this.tpInsc = "4";
      return this;
    }

    /**
     * Informar o número de inscrição do estabelecimento, obra de construção civil ou órgão público
     * de acordo com o tipo de inscrição indicado no campo {ideEstab/tpInsc}(./tpInsc).
     *
     * @return Conteúdo do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição do estabelecimento, obra de construção civil ou órgão público
     * de acordo com o tipo de inscrição indicado no campo {ideEstab/tpInsc}(./tpInsc).
     *
     * <p>Validação: Deve ser compatível com o conteúdo do campo {ideEstab/tpInsc}(./tpInsc). Deve
     * ser um identificador válido, constante das bases da RFB, vinculado ao empregador.
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
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
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setIniValid(String iniValid) {
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
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setFimValid(String fimValid) {
      this.fimValid = fimValid;
      return this;
    }

    public T_ideEstab(Object pai) {
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
   * Detalhamento das informações do estabelecimento
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "cnaePrep",
        "aliqGilrat",
        "infoCaepf",
        "infoObra",
        "infoTrab",
      })
  public static class T_dadosEstab<T> {

    /**
     * Preencher com o código CNAE conforme legislação vigente, referente à atividade econômica
     * preponderante do estabelecimento.
     */
    private Integer cnaePrep;

    /** Informações de apuração da alíquota GILRAT do estabelecimento. */
    private AliqGilrat aliqGilrat;

    /** Informações relativas ao CAEPF */
    private InfoCaepf infoCaepf;

    /** Indicativo de substituição da contribuição patronal - Obra de construção civil */
    private InfoObra infoObra;

    /** Informações trabalhistas */
    private InfoTrab infoTrab;

    /**
     * Preencher com o código CNAE conforme legislação vigente, referente à atividade econômica
     * preponderante do estabelecimento.
     *
     * @return Conteúdo do campo cnaePrep
     */
    public Integer getCnaePrep() {
      return this.cnaePrep;
    }

    /**
     * Preencher com o código CNAE conforme legislação vigente, referente à atividade econômica
     * preponderante do estabelecimento.
     *
     * <p>Validação: Deve ser um número existente na tabela CNAE.
     *
     * @param cnaePrep Valor para atribuir ao campo cnaePrep
     * @return O próprio T_dadosEstab para continuar populando outros campos
     */
    public T_dadosEstab<T> setCnaePrep(Integer cnaePrep) {
      this.cnaePrep = cnaePrep;
      return this;
    }

    /**
     * Informações de apuração da alíquota GILRAT do estabelecimento.
     *
     * @return Conteúdo do campo aliqGilrat
     */
    public AliqGilrat getAliqGilrat() {
      return this.aliqGilrat;
    }

    /**
     * Informações de apuração da alíquota GILRAT do estabelecimento.
     *
     * <p>CONDICAO_GRUPO: OC
     *
     * @return O objeto AliqGilrat para população dos campos filhos
     */
    public AliqGilrat<T_dadosEstab<T>> setAliqGilrat() {
      if (this.aliqGilrat == null) {
        this.aliqGilrat = new AliqGilrat(this);
      }
      return this.aliqGilrat;
    }

    /**
     * Informações relativas ao CAEPF
     *
     * @return Conteúdo do campo infoCaepf
     */
    public InfoCaepf getInfoCaepf() {
      return this.infoCaepf;
    }

    /**
     * Informações relativas ao CAEPF
     *
     * <p>DESCRICAO_COMPLETA:Informações relativas ao Cadastro de Atividade Econômica da Pessoa
     * Física - CAEPF.
     *
     * <p>CONDICAO_GRUPO: O (se {ideEstab/tpInsc}(1005_infoEstab_inclusao_ideEstab_tpInsc) = [3]); N
     * (nos demais casos)
     *
     * @return O objeto InfoCaepf para população dos campos filhos
     */
    public InfoCaepf<T_dadosEstab<T>> setInfoCaepf() {
      if (this.infoCaepf == null) {
        this.infoCaepf = new InfoCaepf(this);
      }
      return this.infoCaepf;
    }

    /**
     * Indicativo de substituição da contribuição patronal - Obra de construção civil
     *
     * @return Conteúdo do campo infoObra
     */
    public InfoObra getInfoObra() {
      return this.infoObra;
    }

    /**
     * Indicativo de substituição da contribuição patronal - Obra de construção civil
     *
     * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente por empresa construtora, relacionando
     * os estabelecimentos inscritos no Cadastro Nacional de Obras - CNO, para indicar a
     * substituição ou não da contribuição patronal incidente sobre a remuneração dos trabalhadores
     * de obra de construção civil.
     *
     * <p>CONDICAO_GRUPO: O (se {indConstr}(1000_infoEmpregador_inclusao_infoCadastro_indConstr) em
     * S-1000 = [1] e {ideEstab/tpInsc}(1005_infoEstab_inclusao_ideEstab_tpInsc) = [4]); N (nos
     * demais casos)
     *
     * @return O objeto InfoObra para população dos campos filhos
     */
    public InfoObra<T_dadosEstab<T>> setInfoObra() {
      if (this.infoObra == null) {
        this.infoObra = new InfoObra(this);
      }
      return this.infoObra;
    }

    /**
     * Informações trabalhistas
     *
     * @return Conteúdo do campo infoTrab
     */
    public InfoTrab getInfoTrab() {
      return this.infoTrab;
    }

    /**
     * Informações trabalhistas
     *
     * <p>DESCRICAO_COMPLETA:Informações trabalhistas relativas ao estabelecimento.
     *
     * <p>CONDICAO_GRUPO: OC
     *
     * @return O objeto InfoTrab para população dos campos filhos
     */
    public InfoTrab<T_dadosEstab<T>> setInfoTrab() {
      if (this.infoTrab == null) {
        this.infoTrab = new InfoTrab(this);
      }
      return this.infoTrab;
    }

    public T_dadosEstab(Object pai) {
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
     * Informações de apuração da alíquota GILRAT do estabelecimento.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "aliqRat",
          "fap",
          "procAdmJudRat",
          "procAdmJudFap",
        })
    public static class AliqGilrat<T> {

      /**
       * Informar a alíquota RAT, quando divergente da legislação vigente para a atividade (CNAE)
       * preponderante. A divergência só é permitida se existir o grupo com informações sobre o
       * processo administrativo/judicial que permite a aplicação de alíquota diferente.
       */
      private String aliqRat;

      /** Fator Acidentário de Prevenção - FAP. */
      private Double fap;

      /** Processo administrativo/judicial relativo à alíquota RAT. */
      private ProcAdmJudRat procAdmJudRat;

      /** Processo administrativo/judicial relativo ao FAP. */
      private ProcAdmJudFap procAdmJudFap;

      /**
       * Informar a alíquota RAT, quando divergente da legislação vigente para a atividade (CNAE)
       * preponderante. A divergência só é permitida se existir o grupo com informações sobre o
       * processo administrativo/judicial que permite a aplicação de alíquota diferente.
       *
       * @return Conteúdo do campo aliqRat
       */
      public String getAliqRat() {
        return this.aliqRat;
      }

      /**
       * Informar a alíquota RAT, quando divergente da legislação vigente para a atividade (CNAE)
       * preponderante. A divergência só é permitida se existir o grupo com informações sobre o
       * processo administrativo/judicial que permite a aplicação de alíquota diferente.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se a alíquota informada for diferente
       * da definida na legislação vigente para o código CNAE informado (neste caso, deverá haver
       * informações de processo em
       * {procAdmJudRat}(1005_infoEstab_inclusao_dadosEstab_aliqGilrat_procAdmJudRat)).
       *
       * <p>Se informada, deve ser diferente da alíquota definida na legislação vigente para a
       * atividade (CNAE) preponderante.
       *
       * @param aliqRat Valor para atribuir ao campo aliqRat
       * @return O próprio AliqGilrat para continuar populando outros campos
       */
      public AliqGilrat<T> setAliqRat(String aliqRat) {
        if (!"1".equals(aliqRat) && !"2".equals(aliqRat) && !"3".equals(aliqRat))
          throw new RuntimeException(
              "Valor " + String.valueOf(aliqRat) + " inválido para o campo aliqRat");
        this.aliqRat = aliqRat;
        return this;
      }

      public AliqGilrat<T> setAliqRat_1() {
        this.aliqRat = "1";
        return this;
      }

      public AliqGilrat<T> setAliqRat_2() {
        this.aliqRat = "2";
        return this;
      }

      public AliqGilrat<T> setAliqRat_3() {
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
       * <p>Validação: Preenchimento obrigatório e exclusivo por Pessoa Jurídica e
       * {ideEstab/tpInsc}(1005_infoEstab_inclusao_ideEstab_tpInsc) = [4], ou se
       * {ideEstab/tpInsc}(1005_infoEstab_inclusao_ideEstab_tpInsc) = [1] e o fator informado for
       * diferente do definido pelo órgão governamental competente para o estabelecimento (neste
       * caso, deverá haver informações de processo em
       * {procAdmJudFap}(1005_infoEstab_inclusao_dadosEstab_aliqGilrat_procAdmJudFap)).
       *
       * <p>Se informado, deve ser um número maior ou igual a 0,5000 e menor ou igual a 2,0000 e, se
       * {ideEstab/tpInsc}(1005_infoEstab_inclusao_ideEstab_tpInsc) = [1], deve ser diferente do
       * valor definido pelo órgão governamental competente.
       *
       * @param fap Valor para atribuir ao campo fap
       * @return O próprio AliqGilrat para continuar populando outros campos
       */
      public AliqGilrat<T> setFap(Double fap) {
        this.fap = fap;
        return this;
      }

      /**
       * Processo administrativo/judicial relativo à alíquota RAT.
       *
       * @return Conteúdo do campo procAdmJudRat
       */
      public ProcAdmJudRat getProcAdmJudRat() {
        return this.procAdmJudRat;
      }

      /**
       * Processo administrativo/judicial relativo à alíquota RAT.
       *
       * <p>DESCRICAO_COMPLETA:Grupo que identifica, em caso de existência, o processo
       * administrativo ou judicial em que houve decisão/sentença favorável ao contribuinte
       * modificando a alíquota RAT da empresa.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto ProcAdmJudRat para população dos campos filhos
       */
      public ProcAdmJudRat<AliqGilrat<T>> setProcAdmJudRat() {
        if (this.procAdmJudRat == null) {
          this.procAdmJudRat = new ProcAdmJudRat(this);
        }
        return this.procAdmJudRat;
      }

      /**
       * Processo administrativo/judicial relativo ao FAP.
       *
       * @return Conteúdo do campo procAdmJudFap
       */
      public ProcAdmJudFap getProcAdmJudFap() {
        return this.procAdmJudFap;
      }

      /**
       * Processo administrativo/judicial relativo ao FAP.
       *
       * <p>DESCRICAO_COMPLETA:Grupo que identifica, em caso de existência, o processo
       * administrativo/judicial em que houve decisão ou sentença favorável ao contribuinte
       * suspendendo ou alterando a alíquota FAP aplicável ao contribuinte.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto ProcAdmJudFap para população dos campos filhos
       */
      public ProcAdmJudFap<AliqGilrat<T>> setProcAdmJudFap() {
        if (this.procAdmJudFap == null) {
          this.procAdmJudFap = new ProcAdmJudFap(this);
        }
        return this.procAdmJudFap;
      }

      public AliqGilrat(Object pai) {
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
       * Processo administrativo/judicial relativo à alíquota RAT.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpProc", "nrProc", "codSusp",
          })
      public static class ProcAdmJudRat<T> {

        /** Preencher com o código correspondente ao tipo de processo. */
        private String tpProc;

        /**
         * Informar um número de processo cadastrado através do evento S-1070, cujo
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
         */
        private String nrProc;

        /** Código do indicativo da suspensão, atribuído pelo empregador em S-1070. */
        private Integer codSusp;

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
         * @return O próprio ProcAdmJudRat para continuar populando outros campos
         */
        public ProcAdmJudRat<T> setTpProc(String tpProc) {
          if (!"1".equals(tpProc) && !"2".equals(tpProc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpProc) + " inválido para o campo tpProc");
          this.tpProc = tpProc;
          return this;
        }
        /**
         * Administrativo
         *
         * @return O próprio ProcAdmJudRat para continuar populando outros campos
         */
        public ProcAdmJudRat<T> setTpProc_1() {
          this.tpProc = "1";
          return this;
        }
        /**
         * Judicial
         *
         * @return O próprio ProcAdmJudRat para continuar populando outros campos
         */
        public ProcAdmJudRat<T> setTpProc_2() {
          this.tpProc = "2";
          return this;
        }

        /**
         * Informar um número de processo cadastrado através do evento S-1070, cujo
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
         *
         * @return Conteúdo do campo nrProc
         */
        public String getNrProc() {
          return this.nrProc;
        }

        /**
         * Informar um número de processo cadastrado através do evento S-1070, cujo
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
         *
         * <p>Validação: Deve ser um número de processo administrativo ou judicial válido e
         * existente na Tabela de Processos (S-1070), com
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1].
         *
         * @param nrProc Valor para atribuir ao campo nrProc
         * @return O próprio ProcAdmJudRat para continuar populando outros campos
         */
        public ProcAdmJudRat<T> setNrProc(String nrProc) {
          this.nrProc = nrProc;
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
         * @return O próprio ProcAdmJudRat para continuar populando outros campos
         */
        public ProcAdmJudRat<T> setCodSusp(Integer codSusp) {
          this.codSusp = codSusp;
          return this;
        }

        public ProcAdmJudRat(Object pai) {
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
       * Processo administrativo/judicial relativo ao FAP.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpProc", "nrProc", "codSusp",
          })
      public static class ProcAdmJudFap<T> {

        /** Preencher com o código correspondente ao tipo de processo. */
        private String tpProc;

        /**
         * Informar um número de processo cadastrado através do evento S-1070, cujo
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
         */
        private String nrProc;

        /** Código do indicativo da suspensão, atribuído pelo empregador em S-1070. */
        private Integer codSusp;

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
         * @return O próprio ProcAdmJudFap para continuar populando outros campos
         */
        public ProcAdmJudFap<T> setTpProc(String tpProc) {
          if (!"1".equals(tpProc) && !"2".equals(tpProc) && !"4".equals(tpProc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpProc) + " inválido para o campo tpProc");
          this.tpProc = tpProc;
          return this;
        }
        /**
         * Administrativo
         *
         * @return O próprio ProcAdmJudFap para continuar populando outros campos
         */
        public ProcAdmJudFap<T> setTpProc_1() {
          this.tpProc = "1";
          return this;
        }
        /**
         * Judicial
         *
         * @return O próprio ProcAdmJudFap para continuar populando outros campos
         */
        public ProcAdmJudFap<T> setTpProc_2() {
          this.tpProc = "2";
          return this;
        }
        /**
         * Processo FAP de exercício anterior a 2019
         *
         * @return O próprio ProcAdmJudFap para continuar populando outros campos
         */
        public ProcAdmJudFap<T> setTpProc_4() {
          this.tpProc = "4";
          return this;
        }

        /**
         * Informar um número de processo cadastrado através do evento S-1070, cujo
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
         *
         * @return Conteúdo do campo nrProc
         */
        public String getNrProc() {
          return this.nrProc;
        }

        /**
         * Informar um número de processo cadastrado através do evento S-1070, cujo
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
         *
         * <p>Validação: Deve ser um número de processo administrativo ou judicial válido e
         * existente na Tabela de Processos (S-1070), com
         * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1].
         *
         * @param nrProc Valor para atribuir ao campo nrProc
         * @return O próprio ProcAdmJudFap para continuar populando outros campos
         */
        public ProcAdmJudFap<T> setNrProc(String nrProc) {
          this.nrProc = nrProc;
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
         * @return O próprio ProcAdmJudFap para continuar populando outros campos
         */
        public ProcAdmJudFap<T> setCodSusp(Integer codSusp) {
          this.codSusp = codSusp;
          return this;
        }

        public ProcAdmJudFap(Object pai) {
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
     * Informações relativas ao CAEPF
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpCaepf",
        })
    public static class InfoCaepf<T> {

      /** Tipo de CAEPF. */
      private String tpCaepf;

      /**
       * Tipo de CAEPF.
       *
       * @return Conteúdo do campo tpCaepf
       */
      public String getTpCaepf() {
        return this.tpCaepf;
      }

      /**
       * Tipo de CAEPF.
       *
       * <p>Validação: Deve ser compatível com o cadastro da RFB.
       *
       * @param tpCaepf Valor para atribuir ao campo tpCaepf
       * @return O próprio InfoCaepf para continuar populando outros campos
       */
      public InfoCaepf<T> setTpCaepf(String tpCaepf) {
        if (!"1".equals(tpCaepf) && !"2".equals(tpCaepf) && !"3".equals(tpCaepf))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpCaepf) + " inválido para o campo tpCaepf");
        this.tpCaepf = tpCaepf;
        return this;
      }
      /**
       * Contribuinte individual
       *
       * @return O próprio InfoCaepf para continuar populando outros campos
       */
      public InfoCaepf<T> setTpCaepf_1() {
        this.tpCaepf = "1";
        return this;
      }
      /**
       * Produtor rural
       *
       * @return O próprio InfoCaepf para continuar populando outros campos
       */
      public InfoCaepf<T> setTpCaepf_2() {
        this.tpCaepf = "2";
        return this;
      }
      /**
       * Segurado especial
       *
       * @return O próprio InfoCaepf para continuar populando outros campos
       */
      public InfoCaepf<T> setTpCaepf_3() {
        this.tpCaepf = "3";
        return this;
      }

      public InfoCaepf(Object pai) {
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
     * Indicativo de substituição da contribuição patronal - Obra de construção civil
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "indSubstPatrObra",
        })
    public static class InfoObra<T> {

      /** Indicativo de substituição da contribuição patronal de obra de construção civil. */
      private String indSubstPatrObra;

      /**
       * Indicativo de substituição da contribuição patronal de obra de construção civil.
       *
       * @return Conteúdo do campo indSubstPatrObra
       */
      public String getIndSubstPatrObra() {
        return this.indSubstPatrObra;
      }

      /**
       * Indicativo de substituição da contribuição patronal de obra de construção civil.
       *
       * @param indSubstPatrObra Valor para atribuir ao campo indSubstPatrObra
       * @return O próprio InfoObra para continuar populando outros campos
       */
      public InfoObra<T> setIndSubstPatrObra(String indSubstPatrObra) {
        if (!"1".equals(indSubstPatrObra) && !"2".equals(indSubstPatrObra))
          throw new RuntimeException(
              "Valor "
                  + String.valueOf(indSubstPatrObra)
                  + " inválido para o campo indSubstPatrObra");
        this.indSubstPatrObra = indSubstPatrObra;
        return this;
      }
      /**
       * Contribuição patronal substituída
       *
       * @return O próprio InfoObra para continuar populando outros campos
       */
      public InfoObra<T> setIndSubstPatrObra_1() {
        this.indSubstPatrObra = "1";
        return this;
      }
      /**
       * Contribuição patronal não substituída
       *
       * @return O próprio InfoObra para continuar populando outros campos
       */
      public InfoObra<T> setIndSubstPatrObra_2() {
        this.indSubstPatrObra = "2";
        return this;
      }

      public InfoObra(Object pai) {
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
     * Informações trabalhistas
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "infoApr", "infoPCD",
        })
    public static class InfoTrab<T> {

      /** Informações relacionadas à contratação de aprendiz */
      private InfoApr infoApr;

      /** Informações sobre a contratação de PCD. */
      private InfoPCD infoPCD;

      /**
       * Informações relacionadas à contratação de aprendiz
       *
       * @return Conteúdo do campo infoApr
       */
      public InfoApr getInfoApr() {
        return this.infoApr;
      }

      /**
       * Informações relacionadas à contratação de aprendiz
       *
       * <p>DESCRICAO_COMPLETA:Informações relacionadas à contratação de aprendiz.
       *
       * <p>Preenchimento obrigatório somente no caso de dispensa, ainda que parcial, de contratação
       * de aprendiz em virtude de processo judicial ou quando houver contratação de aprendiz por
       * meio de entidade educativa ou de prática desportiva.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto InfoApr para população dos campos filhos
       */
      public InfoApr<InfoTrab<T>> setInfoApr() {
        if (this.infoApr == null) {
          this.infoApr = new InfoApr(this);
        }
        return this.infoApr;
      }

      /**
       * Informações sobre a contratação de PCD.
       *
       * @return Conteúdo do campo infoPCD
       */
      public InfoPCD getInfoPCD() {
        return this.infoPCD;
      }

      /**
       * Informações sobre a contratação de PCD.
       *
       * <p>DESCRICAO_COMPLETA:Informações sobre a contratação de pessoa com deficiência (PCD).
       *
       * <p>Essa informação deve ser prestada apenas no estabelecimento matriz.
       *
       * <p>Preenchimento obrigatório somente no caso de dispensa, ainda que parcial, de contratação
       * de PCD em virtude de processo judicial.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto InfoPCD para população dos campos filhos
       */
      public InfoPCD<InfoTrab<T>> setInfoPCD() {
        if (this.infoPCD == null) {
          this.infoPCD = new InfoPCD(this);
        }
        return this.infoPCD;
      }

      public InfoTrab(Object pai) {
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
       * Informações relacionadas à contratação de aprendiz
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nrProcJud",
            "infoEntEduc",
          })
      public static class InfoApr<T> {

        /** Preencher com o número do processo judicial. */
        private String nrProcJud;

        /**
         * Identificação da(s) entidade(s) educativa(s) ou de prática desportiva.
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         */
        private java.util.List<InfoEntEduc> infoEntEduc;

        /**
         * Preencher com o número do processo judicial.
         *
         * @return Conteúdo do campo nrProcJud
         */
        public String getNrProcJud() {
          return this.nrProcJud;
        }

        /**
         * Preencher com o número do processo judicial.
         *
         * <p>Validação: Se informado, deve ser um número de processo judicial válido.
         *
         * @param nrProcJud Valor para atribuir ao campo nrProcJud
         * @return O próprio InfoApr para continuar populando outros campos
         */
        public InfoApr<T> setNrProcJud(String nrProcJud) {
          this.nrProcJud = nrProcJud;
          return this;
        }

        /**
         * Identificação da(s) entidade(s) educativa(s) ou de prática desportiva.
         *
         * @return Conteúdo do campo infoEntEduc
         */
        public java.util.List<InfoEntEduc> getInfoEntEduc() {
          return this.infoEntEduc;
        }

        /**
         * Identificação da(s) entidade(s) educativa(s) ou de prática desportiva.
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         *
         * <p>CHAVE_GRUPO: {nrInsc}
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto InfoEntEduc para população dos campos filhos
         */
        public InfoEntEduc<InfoApr<T>> setInfoEntEduc_Next() {
          if (this.infoEntEduc == null) {
            this.infoEntEduc = new java.util.ArrayList<>();
          }
          InfoEntEduc toAdd = new InfoEntEduc(this);
          this.infoEntEduc.add(toAdd);
          return toAdd;
        }

        public InfoApr(Object pai) {
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
         * Identificação da(s) entidade(s) educativa(s) ou de prática desportiva.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "nrInsc",
            })
        public static class InfoEntEduc<T> {

          /** Informar o número de inscrição da entidade educativa ou de prática desportiva. */
          private String nrInsc;

          /**
           * Informar o número de inscrição da entidade educativa ou de prática desportiva.
           *
           * @return Conteúdo do campo nrInsc
           */
          public String getNrInsc() {
            return this.nrInsc;
          }

          /**
           * Informar o número de inscrição da entidade educativa ou de prática desportiva.
           *
           * <p>Validação: Deve ser um número de CNPJ válido, com 14 (catorze) algarismos. Se o
           * empregador for pessoa jurídica, a raiz do CNPJ informado deve ser diferente de
           * {ideEmpregador/nrInsc}(1005_ideEmpregador_nrInsc).
           *
           * @param nrInsc Valor para atribuir ao campo nrInsc
           * @return O próprio InfoEntEduc para continuar populando outros campos
           */
          public InfoEntEduc<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
          }

          public InfoEntEduc(Object pai) {
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
       * Informações sobre a contratação de PCD.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nrProcJud",
          })
      public static class InfoPCD<T> {

        /** Preencher com o número do processo judicial. */
        private String nrProcJud;

        /**
         * Preencher com o número do processo judicial.
         *
         * @return Conteúdo do campo nrProcJud
         */
        public String getNrProcJud() {
          return this.nrProcJud;
        }

        /**
         * Preencher com o número do processo judicial.
         *
         * <p>Validação: Deve ser um número de processo judicial válido.
         *
         * @param nrProcJud Valor para atribuir ao campo nrProcJud
         * @return O próprio InfoPCD para continuar populando outros campos
         */
        public InfoPCD<T> setNrProcJud(String nrProcJud) {
          this.nrProcJud = nrProcJud;
          return this;
        }

        public InfoPCD(Object pai) {
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
