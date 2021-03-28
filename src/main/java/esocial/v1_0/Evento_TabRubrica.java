package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1010 - Tabela de Rubricas */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtTabRubrica",
    })
@XmlRootElement(name = "eSocial")
public class Evento_TabRubrica {

  /** Evento Tabela de Rubricas. */
  private EvtTabRubrica evtTabRubrica;

  /**
   * Evento Tabela de Rubricas.
   *
   * @return Conteúdo do campo evtTabRubrica
   */
  public EvtTabRubrica getEvtTabRubrica() {
    return this.evtTabRubrica;
  }

  /**
   * Evento Tabela de Rubricas.
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
   * <p>REGRA:REGRA_TABRUBR_INCLUSAO
   *
   * <p>REGRA:REGRA_TAB_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_FUTURA
   *
   * @return O objeto EvtTabRubrica para população dos campos filhos
   */
  public EvtTabRubrica<Evento_TabRubrica> setEvtTabRubrica() {
    if (this.evtTabRubrica == null) {
      this.evtTabRubrica = new EvtTabRubrica(this);
    }
    return this.evtTabRubrica;
  }

  /**
   * Evento Tabela de Rubricas.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoRubrica",
      })
  public static class EvtTabRubrica<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_evtTab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações da rubrica */
    private InfoRubrica infoRubrica;

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
    public Tipos.T_ideEvento_evtTab<EvtTabRubrica<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtTabRubrica<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações da rubrica
     *
     * @return Conteúdo do campo infoRubrica
     */
    public InfoRubrica getInfoRubrica() {
      return this.infoRubrica;
    }

    /**
     * Informações da rubrica
     *
     * <p>DESCRICAO_COMPLETA:Identificação da operação (inclusão, alteração ou exclusão) e das
     * informações da rubrica.
     *
     * @return O objeto InfoRubrica para população dos campos filhos
     */
    public InfoRubrica<EvtTabRubrica<T>> setInfoRubrica() {
      if (this.infoRubrica == null) {
        this.infoRubrica = new InfoRubrica(this);
      }
      return this.infoRubrica;
    }

    public EvtTabRubrica(Object pai) {
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
     * Informações da rubrica
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
    public static class InfoRubrica<T> {

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
      public Inclusao<InfoRubrica<T>> setInclusao() {
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
      public Alteracao<InfoRubrica<T>> setAlteracao() {
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
      public Exclusao<InfoRubrica<T>> setExclusao() {
        if (this.exclusao == null) {
          this.exclusao = new Exclusao(this);
        }
        return this.exclusao;
      }

      public InfoRubrica(Object pai) {
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
            "ideRubrica",
            "dadosRubrica",
          })
      public static class Inclusao<T> {

        /** Identificação da rubrica e validade das informações */
        private T_ideRubrica ideRubrica;

        /** Detalhamento das informações da rubrica. */
        private T_dadosRubrica dadosRubrica;

        /**
         * Identificação da rubrica e validade das informações
         *
         * @return Conteúdo do campo ideRubrica
         */
        public T_ideRubrica getIdeRubrica() {
          return this.ideRubrica;
        }

        /**
         * Identificação da rubrica e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação da rubrica e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {codRubr}, {ideTabRubr}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideRubrica para população dos campos filhos
         */
        public T_ideRubrica<Inclusao<T>> setIdeRubrica() {
          if (this.ideRubrica == null) {
            this.ideRubrica = new T_ideRubrica(this);
          }
          return this.ideRubrica;
        }

        /**
         * Detalhamento das informações da rubrica.
         *
         * @return Conteúdo do campo dadosRubrica
         */
        public T_dadosRubrica getDadosRubrica() {
          return this.dadosRubrica;
        }

        /**
         * Detalhamento das informações da rubrica.
         *
         * @return O objeto T_dadosRubrica para população dos campos filhos
         */
        public T_dadosRubrica<Inclusao<T>> setDadosRubrica() {
          if (this.dadosRubrica == null) {
            this.dadosRubrica = new T_dadosRubrica(this);
          }
          return this.dadosRubrica;
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
            "ideRubrica",
            "dadosRubrica",
            "novaValidade",
          })
      public static class Alteracao<T> {

        /** Identificação da rubrica e validade das informações */
        private T_ideRubrica ideRubrica;

        /** Detalhamento das informações da rubrica. */
        private T_dadosRubrica dadosRubrica;

        /** Novo período de validade das informações. */
        private Tipos.T_novaValidade novaValidade;

        /**
         * Identificação da rubrica e validade das informações
         *
         * @return Conteúdo do campo ideRubrica
         */
        public T_ideRubrica getIdeRubrica() {
          return this.ideRubrica;
        }

        /**
         * Identificação da rubrica e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação da rubrica e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {codRubr}, {ideTabRubr}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideRubrica para população dos campos filhos
         */
        public T_ideRubrica<Alteracao<T>> setIdeRubrica() {
          if (this.ideRubrica == null) {
            this.ideRubrica = new T_ideRubrica(this);
          }
          return this.ideRubrica;
        }

        /**
         * Detalhamento das informações da rubrica.
         *
         * @return Conteúdo do campo dadosRubrica
         */
        public T_dadosRubrica getDadosRubrica() {
          return this.dadosRubrica;
        }

        /**
         * Detalhamento das informações da rubrica.
         *
         * @return O objeto T_dadosRubrica para população dos campos filhos
         */
        public T_dadosRubrica<Alteracao<T>> setDadosRubrica() {
          if (this.dadosRubrica == null) {
            this.dadosRubrica = new T_dadosRubrica(this);
          }
          return this.dadosRubrica;
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
            "ideRubrica",
          })
      public static class Exclusao<T> {

        /** Identificação da rubrica e validade das informações */
        private T_ideRubrica ideRubrica;

        /**
         * Identificação da rubrica e validade das informações
         *
         * @return Conteúdo do campo ideRubrica
         */
        public T_ideRubrica getIdeRubrica() {
          return this.ideRubrica;
        }

        /**
         * Identificação da rubrica e validade das informações
         *
         * <p>DESCRICAO_COMPLETA:Identificação da rubrica e período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {codRubr}, {ideTabRubr}, {iniValid}, {fimValid}
         *
         * @return O objeto T_ideRubrica para população dos campos filhos
         */
        public T_ideRubrica<Exclusao<T>> setIdeRubrica() {
          if (this.ideRubrica == null) {
            this.ideRubrica = new T_ideRubrica(this);
          }
          return this.ideRubrica;
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
   * Identificação da rubrica e validade das informações
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "codRubr",
        "ideTabRubr",
        "iniValid",
        "fimValid",
      })
  public static class T_ideRubrica<T> {

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     */
    private String codRubr;

    /** Preencher com o identificador da Tabela de Rubricas no âmbito do empregador. */
    private String ideTabRubr;

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     */
    private String iniValid;

    /** Preencher com o mês e ano de término da validade das informações, se houver. */
    private String fimValid;

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     *
     * @return Conteúdo do campo codRubr
     */
    public String getCodRubr() {
      return this.codRubr;
    }

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     *
     * <p>Validação: O código não pode conter a expressão 'eSocial' nas 7 (sete) primeiras posições.
     *
     * <p>REGRA:REGRA_CARACTERE_ESPECIAL
     *
     * @param codRubr Valor para atribuir ao campo codRubr
     * @return O próprio T_ideRubrica para continuar populando outros campos
     */
    public T_ideRubrica<T> setCodRubr(String codRubr) {
      this.codRubr = codRubr;
      return this;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas no âmbito do empregador.
     *
     * @return Conteúdo do campo ideTabRubr
     */
    public String getIdeTabRubr() {
      return this.ideTabRubr;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas no âmbito do empregador.
     *
     * <p>Validação: O identificador não pode conter a expressão 'eSocial' nas 7 (sete) primeiras
     * posições.
     *
     * <p>REGRA:REGRA_CARACTERE_ESPECIAL
     *
     * @param ideTabRubr Valor para atribuir ao campo ideTabRubr
     * @return O próprio T_ideRubrica para continuar populando outros campos
     */
    public T_ideRubrica<T> setIdeTabRubr(String ideTabRubr) {
      this.ideTabRubr = ideTabRubr;
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
     * @return O próprio T_ideRubrica para continuar populando outros campos
     */
    public T_ideRubrica<T> setIniValid(String iniValid) {
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
     * @return O próprio T_ideRubrica para continuar populando outros campos
     */
    public T_ideRubrica<T> setFimValid(String fimValid) {
      this.fimValid = fimValid;
      return this;
    }

    public T_ideRubrica(Object pai) {
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
   * Detalhamento das informações da rubrica.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "dscRubr",
        "natRubr",
        "tpRubr",
        "codIncCP",
        "codIncIRRF",
        "codIncFGTS",
        "codIncCPRP",
        "tetoRemun",
        "observacao",
        "ideProcessoCP",
        "ideProcessoIRRF",
        "ideProcessoFGTS",
      })
  public static class T_dadosRubrica<T> {

    /** Informar a descrição (nome) da rubrica no sistema de folha de pagamento da empresa. */
    private String dscRubr;

    /** Informar o código de classificação da rubrica. */
    private Integer natRubr;

    /** Tipo de rubrica. */
    private String tpRubr;

    /** Código de incidência tributária da rubrica para a Previdência Social. */
    private String codIncCP;

    /**
     * Código de incidência tributária da rubrica para o Imposto de Renda Retido na Fonte - IRRF.
     */
    private Integer codIncIRRF;

    /** Código de incidência da rubrica para o Fundo de Garantia do Tempo de Serviço - FGTS. */
    private String codIncFGTS;

    /**
     * Código de incidência da rubrica para as contribuições do Regime Próprio de Previdência Social
     * - RPPS/regime militar.
     */
    private String codIncCPRP;

    /** Informar se a rubrica compõe o teto remuneratório específico (art. 37, XI, da CF/1988). */
    private String tetoRemun;

    /** Observações relacionadas à rubrica ou à sua utilização. */
    private String observacao;

    /**
     * Identificação de processo - Incidência de Contrib. Previdenciária
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     */
    private java.util.List<IdeProcessoCP> ideProcessoCP;

    /**
     * Identificação de processo - Incidência de IRRF
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     */
    private java.util.List<IdeProcessoIRRF> ideProcessoIRRF;

    /**
     * Identificação de processo - Incidência de FGTS
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     */
    private java.util.List<IdeProcessoFGTS> ideProcessoFGTS;

    /**
     * Informar a descrição (nome) da rubrica no sistema de folha de pagamento da empresa.
     *
     * @return Conteúdo do campo dscRubr
     */
    public String getDscRubr() {
      return this.dscRubr;
    }

    /**
     * Informar a descrição (nome) da rubrica no sistema de folha de pagamento da empresa.
     *
     * @param dscRubr Valor para atribuir ao campo dscRubr
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setDscRubr(String dscRubr) {
      this.dscRubr = dscRubr;
      return this;
    }

    /**
     * Informar o código de classificação da rubrica.
     *
     * @return Conteúdo do campo natRubr
     */
    public Integer getNatRubr() {
      return this.natRubr;
    }

    /**
     * Informar o código de classificação da rubrica.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 03.
     *
     * @param natRubr Valor para atribuir ao campo natRubr
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setNatRubr(Integer natRubr) {
      this.natRubr = natRubr;
      return this;
    }

    /**
     * Tipo de rubrica.
     *
     * @return Conteúdo do campo tpRubr
     */
    public String getTpRubr() {
      return this.tpRubr;
    }

    /**
     * Tipo de rubrica.
     *
     * @param tpRubr Valor para atribuir ao campo tpRubr
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTpRubr(String tpRubr) {
      if (!"1".equals(tpRubr) && !"2".equals(tpRubr) && !"3".equals(tpRubr) && !"4".equals(tpRubr))
        throw new RuntimeException(
            "Valor " + String.valueOf(tpRubr) + " inválido para o campo tpRubr");
      this.tpRubr = tpRubr;
      return this;
    }
    /**
     * Vencimento, provento ou pensão
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTpRubr_1() {
      this.tpRubr = "1";
      return this;
    }
    /**
     * Desconto
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTpRubr_2() {
      this.tpRubr = "2";
      return this;
    }
    /**
     * Informativa
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTpRubr_3() {
      this.tpRubr = "3";
      return this;
    }
    /**
     * Informativa dedutora
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTpRubr_4() {
      this.tpRubr = "4";
      return this;
    }

    /**
     * Código de incidência tributária da rubrica para a Previdência Social.
     *
     * @return Conteúdo do campo codIncCP
     */
    public String getCodIncCP() {
      return this.codIncCP;
    }

    /**
     * Código de incidência tributária da rubrica para a Previdência Social.
     *
     * <p>Validação: Para utilização de código [91, 92, 93, 94, 95, 96, 97, 98], é necessária a
     * existência de grupo com informações relativas ao processo.
     *
     * @param codIncCP Valor para atribuir ao campo codIncCP
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP(String codIncCP) {
      if (!"00".equals(codIncCP)
          && !"01".equals(codIncCP)
          && !"11".equals(codIncCP)
          && !"12".equals(codIncCP)
          && !"13".equals(codIncCP)
          && !"14".equals(codIncCP)
          && !"15".equals(codIncCP)
          && !"16".equals(codIncCP)
          && !"21".equals(codIncCP)
          && !"22".equals(codIncCP)
          && !"25".equals(codIncCP)
          && !"26".equals(codIncCP)
          && !"31".equals(codIncCP)
          && !"32".equals(codIncCP)
          && !"34".equals(codIncCP)
          && !"35".equals(codIncCP)
          && !"51".equals(codIncCP)
          && !"91".equals(codIncCP)
          && !"92".equals(codIncCP)
          && !"93".equals(codIncCP)
          && !"94".equals(codIncCP)
          && !"95".equals(codIncCP)
          && !"96".equals(codIncCP)
          && !"97".equals(codIncCP)
          && !"98".equals(codIncCP))
        throw new RuntimeException(
            "Valor " + String.valueOf(codIncCP) + " inválido para o campo codIncCP");
      this.codIncCP = codIncCP;
      return this;
    }
    /**
     * Não é base de cálculo
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_00() {
      this.codIncCP = "00";
      return this;
    }
    /**
     * Não é base de cálculo em função de acordos internacionais de previdência social
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_01() {
      this.codIncCP = "01";
      return this;
    }
    /**
     * Base de cálculo das contribuições sociais - Salário de contribuição:
     *
     * <p>Mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_11() {
      this.codIncCP = "11";
      return this;
    }
    /**
     * 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_12() {
      this.codIncCP = "12";
      return this;
    }
    /**
     * Exclusiva do empregador - Mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_13() {
      this.codIncCP = "13";
      return this;
    }
    /**
     * Exclusiva do empregador - 13° salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_14() {
      this.codIncCP = "14";
      return this;
    }
    /**
     * Exclusiva do segurado - Mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_15() {
      this.codIncCP = "15";
      return this;
    }
    /**
     * Exclusiva do segurado - 13° salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_16() {
      this.codIncCP = "16";
      return this;
    }
    /**
     * Salário-maternidade mensal, pago pelo empregador
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_21() {
      this.codIncCP = "21";
      return this;
    }
    /**
     * Salário-maternidade 13º salário, pago pelo empregador
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_22() {
      this.codIncCP = "22";
      return this;
    }
    /**
     * Salário-maternidade mensal, pago pelo INSS
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_25() {
      this.codIncCP = "25";
      return this;
    }
    /**
     * Salário-maternidade 13° salário, pago pelo INSS
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_26() {
      this.codIncCP = "26";
      return this;
    }
    /**
     * Contribuição descontada do segurado sobre salário de contribuição:
     *
     * <p>Mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_31() {
      this.codIncCP = "31";
      return this;
    }
    /**
     * 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_32() {
      this.codIncCP = "32";
      return this;
    }
    /**
     * SEST
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_34() {
      this.codIncCP = "34";
      return this;
    }
    /**
     * SENAT
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_35() {
      this.codIncCP = "35";
      return this;
    }
    /**
     * Outros:
     *
     * <p>Salário-família
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_51() {
      this.codIncCP = "51";
      return this;
    }
    /**
     * Suspensão de incidência sobre salário de contribuição em decorrência de decisão judicial:
     *
     * <p>Mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_91() {
      this.codIncCP = "91";
      return this;
    }
    /**
     * 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_92() {
      this.codIncCP = "92";
      return this;
    }
    /**
     * Salário-maternidade
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_93() {
      this.codIncCP = "93";
      return this;
    }
    /**
     * Salário-maternidade 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_94() {
      this.codIncCP = "94";
      return this;
    }
    /**
     * Exclusiva do empregador - Mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_95() {
      this.codIncCP = "95";
      return this;
    }
    /**
     * Exclusiva do empregador - 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_96() {
      this.codIncCP = "96";
      return this;
    }
    /**
     * Exclusiva do empregador - Salário-maternidade
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_97() {
      this.codIncCP = "97";
      return this;
    }
    /**
     * Exclusiva do empregador - Salário-maternidade 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCP_98() {
      this.codIncCP = "98";
      return this;
    }

    /**
     * Código de incidência tributária da rubrica para o Imposto de Renda Retido na Fonte - IRRF.
     *
     * @return Conteúdo do campo codIncIRRF
     */
    public Integer getCodIncIRRF() {
      return this.codIncIRRF;
    }

    /**
     * Código de incidência tributária da rubrica para o Imposto de Renda Retido na Fonte - IRRF.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 21.
     *
     * <p>Para utilização de código [9X] ou [9XXX], é necessária a existência de grupo com
     * informações relativas ao processo.
     *
     * @param codIncIRRF Valor para atribuir ao campo codIncIRRF
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncIRRF(Integer codIncIRRF) {
      this.codIncIRRF = codIncIRRF;
      return this;
    }

    /**
     * Código de incidência da rubrica para o Fundo de Garantia do Tempo de Serviço - FGTS.
     *
     * @return Conteúdo do campo codIncFGTS
     */
    public String getCodIncFGTS() {
      return this.codIncFGTS;
    }

    /**
     * Código de incidência da rubrica para o Fundo de Garantia do Tempo de Serviço - FGTS.
     *
     * <p>Validação: Para utilização de código [91, 92, 93], é necessária a existência de grupo com
     * informações relativas ao processo.
     *
     * @param codIncFGTS Valor para atribuir ao campo codIncFGTS
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS(String codIncFGTS) {
      if (!"00".equals(codIncFGTS)
          && !"11".equals(codIncFGTS)
          && !"12".equals(codIncFGTS)
          && !"21".equals(codIncFGTS)
          && !"91".equals(codIncFGTS)
          && !"92".equals(codIncFGTS)
          && !"93".equals(codIncFGTS))
        throw new RuntimeException(
            "Valor " + String.valueOf(codIncFGTS) + " inválido para o campo codIncFGTS");
      this.codIncFGTS = codIncFGTS;
      return this;
    }
    /**
     * Não é base de cálculo do FGTS
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS_00() {
      this.codIncFGTS = "00";
      return this;
    }
    /**
     * Base de cálculo do FGTS mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS_11() {
      this.codIncFGTS = "11";
      return this;
    }
    /**
     * Base de cálculo do FGTS 13° salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS_12() {
      this.codIncFGTS = "12";
      return this;
    }
    /**
     * Base de cálculo do FGTS aviso prévio indenizado
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS_21() {
      this.codIncFGTS = "21";
      return this;
    }
    /**
     * Incidência suspensa em decorrência de decisão judicial - FGTS mensal
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS_91() {
      this.codIncFGTS = "91";
      return this;
    }
    /**
     * Incidência suspensa em decorrência de decisão judicial - FGTS 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS_92() {
      this.codIncFGTS = "92";
      return this;
    }
    /**
     * Incidência suspensa em decorrência de decisão judicial - FGTS aviso prévio indenizado
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncFGTS_93() {
      this.codIncFGTS = "93";
      return this;
    }

    /**
     * Código de incidência da rubrica para as contribuições do Regime Próprio de Previdência Social
     * - RPPS/regime militar.
     *
     * @return Conteúdo do campo codIncCPRP
     */
    public String getCodIncCPRP() {
      return this.codIncCPRP;
    }

    /**
     * Código de incidência da rubrica para as contribuições do Regime Próprio de Previdência Social
     * - RPPS/regime militar.
     *
     * @param codIncCPRP Valor para atribuir ao campo codIncCPRP
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCPRP(String codIncCPRP) {
      if (!"00".equals(codIncCPRP)
          && !"11".equals(codIncCPRP)
          && !"12".equals(codIncCPRP)
          && !"31".equals(codIncCPRP)
          && !"32".equals(codIncCPRP)
          && !"91".equals(codIncCPRP))
        throw new RuntimeException(
            "Valor " + String.valueOf(codIncCPRP) + " inválido para o campo codIncCPRP");
      this.codIncCPRP = codIncCPRP;
      return this;
    }
    /**
     * Não é base de cálculo de contribuições devidas ao RPPS/regime militar
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCPRP_00() {
      this.codIncCPRP = "00";
      return this;
    }
    /**
     * Base de cálculo de contribuições devidas ao RPPS/regime militar
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCPRP_11() {
      this.codIncCPRP = "11";
      return this;
    }
    /**
     * Base de cálculo de contribuições devidas ao RPPS/regime militar - 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCPRP_12() {
      this.codIncCPRP = "12";
      return this;
    }
    /**
     * Contribuição descontada do segurado e beneficiário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCPRP_31() {
      this.codIncCPRP = "31";
      return this;
    }
    /**
     * Contribuição descontada do segurado e beneficiário - 13º salário
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCPRP_32() {
      this.codIncCPRP = "32";
      return this;
    }
    /**
     * Suspensão de incidência em decorrência de decisão judicial
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setCodIncCPRP_91() {
      this.codIncCPRP = "91";
      return this;
    }

    /**
     * Informar se a rubrica compõe o teto remuneratório específico (art. 37, XI, da CF/1988).
     *
     * @return Conteúdo do campo tetoRemun
     */
    public String getTetoRemun() {
      return this.tetoRemun;
    }

    /**
     * Informar se a rubrica compõe o teto remuneratório específico (art. 37, XI, da CF/1988).
     *
     * <p>Validação: Preenchimento obrigatório se a natureza jurídica do declarante for
     * Administração Pública (grupo [1]).
     *
     * @param tetoRemun Valor para atribuir ao campo tetoRemun
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTetoRemun(String tetoRemun) {
      if (!"S".equals(tetoRemun) && !"N".equals(tetoRemun))
        throw new RuntimeException(
            "Valor " + String.valueOf(tetoRemun) + " inválido para o campo tetoRemun");
      this.tetoRemun = tetoRemun;
      return this;
    }
    /**
     * Sim
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTetoRemun_S() {
      this.tetoRemun = "S";
      return this;
    }
    /**
     * Não
     *
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setTetoRemun_N() {
      this.tetoRemun = "N";
      return this;
    }

    /**
     * Observações relacionadas à rubrica ou à sua utilização.
     *
     * @return Conteúdo do campo observacao
     */
    public String getObservacao() {
      return this.observacao;
    }

    /**
     * Observações relacionadas à rubrica ou à sua utilização.
     *
     * @param observacao Valor para atribuir ao campo observacao
     * @return O próprio T_dadosRubrica para continuar populando outros campos
     */
    public T_dadosRubrica<T> setObservacao(String observacao) {
      this.observacao = observacao;
      return this;
    }

    /**
     * Identificação de processo - Incidência de Contrib. Previdenciária
     *
     * @return Conteúdo do campo ideProcessoCP
     */
    public java.util.List<IdeProcessoCP> getIdeProcessoCP() {
      return this.ideProcessoCP;
    }

    /**
     * Identificação de processo - Incidência de Contrib. Previdenciária
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     *
     * <p>DESCRICAO_COMPLETA:Caso a empresa possua processo administrativo ou judicial com
     * decisão/sentença favorável, determinando a não incidência de contribuição previdenciária
     * relativa à rubrica identificada no evento, as informações deverão ser incluídas neste grupo,
     * e o detalhamento do processo deverá ser efetuado através de evento específico na Tabela de
     * Processos (S-1070).
     *
     * <p>CHAVE_GRUPO: {nrProc}
     *
     * <p>CONDICAO_GRUPO: O (se {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) = [9X]);
     * N (nos demais casos)
     *
     * @return O objeto IdeProcessoCP para população dos campos filhos
     */
    public IdeProcessoCP<T_dadosRubrica<T>> setIdeProcessoCP_Next() {
      if (this.ideProcessoCP == null) {
        this.ideProcessoCP = new java.util.ArrayList<>();
      }
      IdeProcessoCP toAdd = new IdeProcessoCP(this);
      this.ideProcessoCP.add(toAdd);
      return toAdd;
    }

    /**
     * Identificação de processo - Incidência de IRRF
     *
     * @return Conteúdo do campo ideProcessoIRRF
     */
    public java.util.List<IdeProcessoIRRF> getIdeProcessoIRRF() {
      return this.ideProcessoIRRF;
    }

    /**
     * Identificação de processo - Incidência de IRRF
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     *
     * <p>DESCRICAO_COMPLETA:Caso a empresa possua processo judicial com decisão/sentença favorável,
     * determinando a não incidência de imposto de renda relativo à rubrica identificada no evento,
     * as informações deverão ser incluídas neste grupo, e o detalhamento do processo deverá ser
     * efetuado através de evento específico na Tabela de Processos (S-1070).
     *
     * <p>CHAVE_GRUPO: {nrProc}
     *
     * <p>CONDICAO_GRUPO: O (se {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) =
     * [9X] ou [9XXX]); N (nos demais casos)
     *
     * @return O objeto IdeProcessoIRRF para população dos campos filhos
     */
    public IdeProcessoIRRF<T_dadosRubrica<T>> setIdeProcessoIRRF_Next() {
      if (this.ideProcessoIRRF == null) {
        this.ideProcessoIRRF = new java.util.ArrayList<>();
      }
      IdeProcessoIRRF toAdd = new IdeProcessoIRRF(this);
      this.ideProcessoIRRF.add(toAdd);
      return toAdd;
    }

    /**
     * Identificação de processo - Incidência de FGTS
     *
     * @return Conteúdo do campo ideProcessoFGTS
     */
    public java.util.List<IdeProcessoFGTS> getIdeProcessoFGTS() {
      return this.ideProcessoFGTS;
    }

    /**
     * Identificação de processo - Incidência de FGTS
     *
     * <p>- Esse campo pode ser repetido até 99 vezes
     *
     * <p>DESCRICAO_COMPLETA:Caso a empresa possua processo judicial com decisão/sentença favorável,
     * determinando a não incidência de FGTS relativo à rubrica identificada no evento, as
     * informações deverão ser incluídas neste grupo, e o detalhamento do processo deverá ser
     * efetuado através de evento específico na Tabela de Processos (S-1070).
     *
     * <p>CHAVE_GRUPO: {nrProc}
     *
     * <p>CONDICAO_GRUPO: O (se {codIncFGTS}(1010_infoRubrica_inclusao_dadosRubrica_codIncFGTS) =
     * [9X]); N (nos demais casos)
     *
     * @return O objeto IdeProcessoFGTS para população dos campos filhos
     */
    public IdeProcessoFGTS<T_dadosRubrica<T>> setIdeProcessoFGTS_Next() {
      if (this.ideProcessoFGTS == null) {
        this.ideProcessoFGTS = new java.util.ArrayList<>();
      }
      IdeProcessoFGTS toAdd = new IdeProcessoFGTS(this);
      this.ideProcessoFGTS.add(toAdd);
      return toAdd;
    }

    public T_dadosRubrica(Object pai) {
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
     * Identificação de processo - Incidência de Contrib. Previdenciária
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpProc",
          "nrProc",
          "extDecisao",
          "codSusp",
        })
    public static class IdeProcessoCP<T> {

      /** Preencher com o código correspondente ao tipo de processo. */
      private String tpProc;

      /**
       * Informar um número de processo cadastrado através do evento S-1070, cujo
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
       */
      private String nrProc;

      /** Extensão da decisão/sentença. */
      private String extDecisao;

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
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setTpProc(String tpProc) {
        if (!"1".equals(tpProc) && !"2".equals(tpProc))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpProc) + " inválido para o campo tpProc");
        this.tpProc = tpProc;
        return this;
      }
      /**
       * Administrativo
       *
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setTpProc_1() {
        this.tpProc = "1";
        return this;
      }
      /**
       * Judicial
       *
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setTpProc_2() {
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
       * <p>Validação: Deve ser um número de processo administrativo ou judicial válido e existente
       * na Tabela de Processos (S-1070), com
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1].
       *
       * @param nrProc Valor para atribuir ao campo nrProc
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setNrProc(String nrProc) {
        this.nrProc = nrProc;
        return this;
      }

      /**
       * Extensão da decisão/sentença.
       *
       * @return Conteúdo do campo extDecisao
       */
      public String getExtDecisao() {
        return this.extDecisao;
      }

      /**
       * Extensão da decisão/sentença.
       *
       * @param extDecisao Valor para atribuir ao campo extDecisao
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setExtDecisao(String extDecisao) {
        if (!"1".equals(extDecisao) && !"2".equals(extDecisao))
          throw new RuntimeException(
              "Valor " + String.valueOf(extDecisao) + " inválido para o campo extDecisao");
        this.extDecisao = extDecisao;
        return this;
      }
      /**
       * Contribuição previdenciária patronal
       *
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setExtDecisao_1() {
        this.extDecisao = "1";
        return this;
      }
      /**
       * Contribuição previdenciária patronal + descontada dos segurados
       *
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setExtDecisao_2() {
        this.extDecisao = "2";
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
       * <p>Validação: A informação prestada deve estar de acordo com o que foi informado em S-1070.
       *
       * @param codSusp Valor para atribuir ao campo codSusp
       * @return O próprio IdeProcessoCP para continuar populando outros campos
       */
      public IdeProcessoCP<T> setCodSusp(Integer codSusp) {
        this.codSusp = codSusp;
        return this;
      }

      public IdeProcessoCP(Object pai) {
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
     * Identificação de processo - Incidência de IRRF
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "nrProc", "codSusp",
        })
    public static class IdeProcessoIRRF<T> {

      /**
       * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
       */
      private String nrProc;

      /** Código do indicativo da suspensão, atribuído pelo empregador em S-1070. */
      private Integer codSusp;

      /**
       * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
       *
       * @return Conteúdo do campo nrProc
       */
      public String getNrProc() {
        return this.nrProc;
      }

      /**
       * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
       *
       * <p>Validação: Deve ser um número de processo judicial válido e existente na Tabela de
       * Processos (S-1070), com {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) =
       * [1].
       *
       * @param nrProc Valor para atribuir ao campo nrProc
       * @return O próprio IdeProcessoIRRF para continuar populando outros campos
       */
      public IdeProcessoIRRF<T> setNrProc(String nrProc) {
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
       * <p>Validação: A informação prestada deve estar de acordo com o que foi informado em S-1070.
       *
       * @param codSusp Valor para atribuir ao campo codSusp
       * @return O próprio IdeProcessoIRRF para continuar populando outros campos
       */
      public IdeProcessoIRRF<T> setCodSusp(Integer codSusp) {
        this.codSusp = codSusp;
        return this;
      }

      public IdeProcessoIRRF(Object pai) {
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
     * Identificação de processo - Incidência de FGTS
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "nrProc",
        })
    public static class IdeProcessoFGTS<T> {

      /**
       * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1, 7].
       */
      private String nrProc;

      /**
       * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1, 7].
       *
       * @return Conteúdo do campo nrProc
       */
      public String getNrProc() {
        return this.nrProc;
      }

      /**
       * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
       * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1, 7].
       *
       * <p>Validação: Deve ser um número de processo judicial válido e existente na Tabela de
       * Processos (S-1070), com {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1,
       * 7].
       *
       * @param nrProc Valor para atribuir ao campo nrProc
       * @return O próprio IdeProcessoFGTS para continuar populando outros campos
       */
      public IdeProcessoFGTS<T> setNrProc(String nrProc) {
        this.nrProc = nrProc;
        return this;
      }

      public IdeProcessoFGTS(Object pai) {
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
