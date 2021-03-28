package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1000 - Informações do Empregador/Contribuinte/Órgão Público */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtInfoEmpregador",
    })
@XmlRootElement(name = "eSocial")
public class Evento_InfoEmpregador {

  /** Evento Informações do Empregador. */
  private EvtInfoEmpregador evtInfoEmpregador;

  /**
   * Evento Informações do Empregador.
   *
   * @return Conteúdo do campo evtInfoEmpregador
   */
  public EvtInfoEmpregador getEvtInfoEmpregador() {
    return this.evtInfoEmpregador;
  }

  /**
   * Evento Informações do Empregador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_INFO_EMP_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_CLASSTRIB_NATJURID
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_DTINICIAL
   *
   * <p>REGRA:REGRA_TAB_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_FUTURA
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * @return O objeto EvtInfoEmpregador para população dos campos filhos
   */
  public EvtInfoEmpregador<Evento_InfoEmpregador> setEvtInfoEmpregador() {
    if (this.evtInfoEmpregador == null) {
      this.evtInfoEmpregador = new EvtInfoEmpregador(this);
    }
    return this.evtInfoEmpregador;
  }

  /**
   * Evento Informações do Empregador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoEmpregador",
      })
  public static class EvtInfoEmpregador<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_evtTab ideEvento;

    /** Informações de identificação do empregador. */
    private IdeEmpregador ideEmpregador;

    /** Informações do empregador. */
    private InfoEmpregador infoEmpregador;

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
    public Tipos.T_ideEvento_evtTab<EvtInfoEmpregador<T>> setIdeEvento() {
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
    public IdeEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto IdeEmpregador para população dos campos filhos
     */
    public IdeEmpregador<EvtInfoEmpregador<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new IdeEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações do empregador.
     *
     * @return Conteúdo do campo infoEmpregador
     */
    public InfoEmpregador getInfoEmpregador() {
      return this.infoEmpregador;
    }

    /**
     * Informações do empregador.
     *
     * <p>DESCRICAO_COMPLETA:Identificação da operação (inclusão, alteração ou exclusão) e das
     * respectivas informações do empregador.
     *
     * @return O objeto InfoEmpregador para população dos campos filhos
     */
    public InfoEmpregador<EvtInfoEmpregador<T>> setInfoEmpregador() {
      if (this.infoEmpregador == null) {
        this.infoEmpregador = new InfoEmpregador(this);
      }
      return this.infoEmpregador;
    }

    public EvtInfoEmpregador(Object pai) {
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
     * Informações de identificação do empregador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpInsc", "nrInsc",
        })
    public static class IdeEmpregador<T> {

      /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
      private String tpInsc;

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {tpInsc}(./tpInsc).
       */
      private String nrInsc;

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
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setTpInsc(String tpInsc) {
        if (!"1".equals(tpInsc) && !"2".equals(tpInsc))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
        this.tpInsc = tpInsc;
        return this;
      }
      /**
       * CNPJ
       *
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setTpInsc_1() {
        this.tpInsc = "1";
        return this;
      }
      /**
       * CPF
       *
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setTpInsc_2() {
        this.tpInsc = "2";
        return this;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {tpInsc}(./tpInsc).
       *
       * @return Conteúdo do campo nrInsc
       */
      public String getNrInsc() {
        return this.nrInsc;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {tpInsc}(./tpInsc).
       *
       * <p>Validação: Se {tpInsc}(./tpInsc) for igual a [1], deve ser um número de CNPJ válido.
       * Neste caso, deve ser informada apenas a raiz/base (8 posições), exceto se natureza jurídica
       * do declarante for igual a 101-5, 104-0, 107-4, 110-4, 113-9, 116-3, 119-8, 125-2, 128-7,
       * 131-7 ou 134-1, situação em que o campo deve ser preenchido com o CNPJ completo (14
       * posições).
       *
       * <p>Se {tpInsc}(./tpInsc) for igual a [2], deve ser um CPF válido.
       *
       * @param nrInsc Valor para atribuir ao campo nrInsc
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
        return this;
      }

      public IdeEmpregador(Object pai) {
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
     * Informações do empregador.
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
    public static class InfoEmpregador<T> {

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
      public Inclusao<InfoEmpregador<T>> setInclusao() {
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
      public Alteracao<InfoEmpregador<T>> setAlteracao() {
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
      public Exclusao<InfoEmpregador<T>> setExclusao() {
        if (this.exclusao == null) {
          this.exclusao = new Exclusao(this);
        }
        return this.exclusao;
      }

      public InfoEmpregador(Object pai) {
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
            "idePeriodo",
            "infoCadastro",
          })
      public static class Inclusao<T> {

        /** Período de validade das informações. */
        private T_idePeriodo idePeriodo;

        /** Detalhamento das informações do empregador. */
        private T_infoCadastro infoCadastro;

        /**
         * Período de validade das informações.
         *
         * @return Conteúdo do campo idePeriodo
         */
        public T_idePeriodo getIdePeriodo() {
          return this.idePeriodo;
        }

        /**
         * Período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {iniValid}, {fimValid}
         *
         * @return O objeto T_idePeriodo para população dos campos filhos
         */
        public T_idePeriodo<Inclusao<T>> setIdePeriodo() {
          if (this.idePeriodo == null) {
            this.idePeriodo = new T_idePeriodo(this);
          }
          return this.idePeriodo;
        }

        /**
         * Detalhamento das informações do empregador.
         *
         * @return Conteúdo do campo infoCadastro
         */
        public T_infoCadastro getInfoCadastro() {
          return this.infoCadastro;
        }

        /**
         * Detalhamento das informações do empregador.
         *
         * @return O objeto T_infoCadastro para população dos campos filhos
         */
        public T_infoCadastro<Inclusao<T>> setInfoCadastro() {
          if (this.infoCadastro == null) {
            this.infoCadastro = new T_infoCadastro(this);
          }
          return this.infoCadastro;
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
            "idePeriodo",
            "infoCadastro",
            "novaValidade",
          })
      public static class Alteracao<T> {

        /** Período de validade das informações. */
        private T_idePeriodo idePeriodo;

        /** Detalhamento das informações do empregador. */
        private T_infoCadastro infoCadastro;

        /** Novo período de validade das informações. */
        private T_idePeriodo novaValidade;

        /**
         * Período de validade das informações.
         *
         * @return Conteúdo do campo idePeriodo
         */
        public T_idePeriodo getIdePeriodo() {
          return this.idePeriodo;
        }

        /**
         * Período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {iniValid}, {fimValid}
         *
         * @return O objeto T_idePeriodo para população dos campos filhos
         */
        public T_idePeriodo<Alteracao<T>> setIdePeriodo() {
          if (this.idePeriodo == null) {
            this.idePeriodo = new T_idePeriodo(this);
          }
          return this.idePeriodo;
        }

        /**
         * Detalhamento das informações do empregador.
         *
         * @return Conteúdo do campo infoCadastro
         */
        public T_infoCadastro getInfoCadastro() {
          return this.infoCadastro;
        }

        /**
         * Detalhamento das informações do empregador.
         *
         * @return O objeto T_infoCadastro para população dos campos filhos
         */
        public T_infoCadastro<Alteracao<T>> setInfoCadastro() {
          if (this.infoCadastro == null) {
            this.infoCadastro = new T_infoCadastro(this);
          }
          return this.infoCadastro;
        }

        /**
         * Novo período de validade das informações.
         *
         * @return Conteúdo do campo novaValidade
         */
        public T_idePeriodo getNovaValidade() {
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
         * @return O objeto T_idePeriodo para população dos campos filhos
         */
        public T_idePeriodo<Alteracao<T>> setNovaValidade() {
          if (this.novaValidade == null) {
            this.novaValidade = new T_idePeriodo(this);
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
            "idePeriodo",
          })
      public static class Exclusao<T> {

        /** Período de validade das informações. */
        private T_idePeriodo idePeriodo;

        /**
         * Período de validade das informações.
         *
         * @return Conteúdo do campo idePeriodo
         */
        public T_idePeriodo getIdePeriodo() {
          return this.idePeriodo;
        }

        /**
         * Período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {iniValid}, {fimValid}
         *
         * @return O objeto T_idePeriodo para população dos campos filhos
         */
        public T_idePeriodo<Exclusao<T>> setIdePeriodo() {
          if (this.idePeriodo == null) {
            this.idePeriodo = new T_idePeriodo(this);
          }
          return this.idePeriodo;
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
   * Período de validade das informações.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "iniValid",
        "fimValid",
      })
  public static class T_idePeriodo<T> {

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     */
    private String iniValid;

    /** Preencher com o mês e ano de término da validade das informações, se houver. */
    private String fimValid;

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
     * @return O próprio T_idePeriodo para continuar populando outros campos
     */
    public T_idePeriodo<T> setIniValid(String iniValid) {
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
     * @return O próprio T_idePeriodo para continuar populando outros campos
     */
    public T_idePeriodo<T> setFimValid(String fimValid) {
      this.fimValid = fimValid;
      return this;
    }

    public T_idePeriodo(Object pai) {
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
   * Detalhamento das informações do empregador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "classTrib",
        "indCoop",
        "indConstr",
        "indDesFolha",
        "indOpcCP",
        "indPorte",
        "indOptRegEletron",
        "cnpjEFR",
        "dadosIsencao",
        "infoOrgInternacional",
      })
  public static class T_infoCadastro<T> {

    /** Preencher com o código correspondente à classificação tributária do contribuinte. */
    private String classTrib;

    /** Indicativo de cooperativa. */
    private String indCoop;

    /** Indicativo de construtora. */
    private String indConstr;

    /** Indicativo de desoneração da folha. */
    private String indDesFolha;

    /**
     * Indicativo da opção pelo produtor rural pela forma de tributação da contribuição
     * previdenciária, nos termos do art. 25, § 13, da Lei 8.212/1991 e do art. 25, § 7°, da Lei
     * 8.870/1994. O não preenchimento deste campo por parte do produtor rural implica opção pela
     * comercialização da sua produção.
     */
    private String indOpcCP;

    /**
     * Indicativo de microempresa - ME ou empresa de pequeno porte - EPP para permissão de acesso ao
     * módulo simplificado. Não preencher caso o empregador não se enquadre como micro ou pequena
     * empresa.
     */
    private String indPorte;

    /** Indica se houve opção pelo registro eletrônico de empregados. */
    private String indOptRegEletron;

    /** CNPJ do Ente Federativo Responsável - EFR. */
    private String cnpjEFR;

    /** Informações complementares - Empresas isentas - Dados da isenção. */
    private DadosIsencao dadosIsencao;

    /**
     * Informações exclusivas de organismos internacionais e outras instituições extraterritoriais.
     */
    private InfoOrgInternacional infoOrgInternacional;

    /**
     * Preencher com o código correspondente à classificação tributária do contribuinte.
     *
     * @return Conteúdo do campo classTrib
     */
    public String getClassTrib() {
      return this.classTrib;
    }

    /**
     * Preencher com o código correspondente à classificação tributária do contribuinte.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 08. Os códigos [21] e [22]
     * somente podem ser utilizados se {tpInsc}(1000_ideEmpregador_tpInsc) for igual a [2]. Para os
     * demais códigos, {tpInsc}(1000_ideEmpregador_tpInsc) deve ser igual a [1].
     *
     * @param classTrib Valor para atribuir ao campo classTrib
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setClassTrib(String classTrib) {
      this.classTrib = classTrib;
      return this;
    }

    /**
     * Indicativo de cooperativa.
     *
     * @return Conteúdo do campo indCoop
     */
    public String getIndCoop() {
      return this.indCoop;
    }

    /**
     * Indicativo de cooperativa.
     *
     * <p>Validação: O preenchimento do campo é exclusivo e obrigatório para PJ. Somente pode ser
     * diferente de [0] se a natureza jurídica do declarante for igual a 214-3.
     *
     * @param indCoop Valor para atribuir ao campo indCoop
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndCoop(String indCoop) {
      if (!"0".equals(indCoop)
          && !"1".equals(indCoop)
          && !"2".equals(indCoop)
          && !"3".equals(indCoop))
        throw new RuntimeException(
            "Valor " + String.valueOf(indCoop) + " inválido para o campo indCoop");
      this.indCoop = indCoop;
      return this;
    }
    /**
     * Não é cooperativa
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndCoop_0() {
      this.indCoop = "0";
      return this;
    }
    /**
     * Cooperativa de trabalho
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndCoop_1() {
      this.indCoop = "1";
      return this;
    }
    /**
     * Cooperativa de produção
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndCoop_2() {
      this.indCoop = "2";
      return this;
    }
    /**
     * Outras cooperativas
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndCoop_3() {
      this.indCoop = "3";
      return this;
    }

    /**
     * Indicativo de construtora.
     *
     * @return Conteúdo do campo indConstr
     */
    public String getIndConstr() {
      return this.indConstr;
    }

    /**
     * Indicativo de construtora.
     *
     * <p>Validação: O preenchimento do campo é exclusivo e obrigatório para PJ.
     *
     * @param indConstr Valor para atribuir ao campo indConstr
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndConstr(String indConstr) {
      if (!"0".equals(indConstr) && !"1".equals(indConstr))
        throw new RuntimeException(
            "Valor " + String.valueOf(indConstr) + " inválido para o campo indConstr");
      this.indConstr = indConstr;
      return this;
    }
    /**
     * Não é construtora
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndConstr_0() {
      this.indConstr = "0";
      return this;
    }
    /**
     * Empresa construtora
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndConstr_1() {
      this.indConstr = "1";
      return this;
    }

    /**
     * Indicativo de desoneração da folha.
     *
     * @return Conteúdo do campo indDesFolha
     */
    public String getIndDesFolha() {
      return this.indDesFolha;
    }

    /**
     * Indicativo de desoneração da folha.
     *
     * <p>Validação: Pode ser igual a [1] apenas se {classTrib}(./classTrib) = [02, 03, 99]. Nos
     * demais casos, deve ser igual a [0].
     *
     * @param indDesFolha Valor para atribuir ao campo indDesFolha
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndDesFolha(String indDesFolha) {
      if (!"0".equals(indDesFolha) && !"1".equals(indDesFolha))
        throw new RuntimeException(
            "Valor " + String.valueOf(indDesFolha) + " inválido para o campo indDesFolha");
      this.indDesFolha = indDesFolha;
      return this;
    }
    /**
     * Não aplicável
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndDesFolha_0() {
      this.indDesFolha = "0";
      return this;
    }
    /**
     * Empresa enquadrada nos arts. 7º a 9º da Lei 12.546/2011
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndDesFolha_1() {
      this.indDesFolha = "1";
      return this;
    }

    /**
     * Indicativo da opção pelo produtor rural pela forma de tributação da contribuição
     * previdenciária, nos termos do art. 25, § 13, da Lei 8.212/1991 e do art. 25, § 7°, da Lei
     * 8.870/1994. O não preenchimento deste campo por parte do produtor rural implica opção pela
     * comercialização da sua produção.
     *
     * @return Conteúdo do campo indOpcCP
     */
    public String getIndOpcCP() {
      return this.indOpcCP;
    }

    /**
     * Indicativo da opção pelo produtor rural pela forma de tributação da contribuição
     * previdenciária, nos termos do art. 25, § 13, da Lei 8.212/1991 e do art. 25, § 7°, da Lei
     * 8.870/1994. O não preenchimento deste campo por parte do produtor rural implica opção pela
     * comercialização da sua produção.
     *
     * <p>Validação: Não preencher se {classTrib}(./classTrib) for diferente de [07, 21].
     *
     * @param indOpcCP Valor para atribuir ao campo indOpcCP
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndOpcCP(String indOpcCP) {
      if (!"1".equals(indOpcCP) && !"2".equals(indOpcCP))
        throw new RuntimeException(
            "Valor " + String.valueOf(indOpcCP) + " inválido para o campo indOpcCP");
      this.indOpcCP = indOpcCP;
      return this;
    }
    /**
     * Sobre a comercialização da sua produção
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndOpcCP_1() {
      this.indOpcCP = "1";
      return this;
    }
    /**
     * Sobre a folha de pagamento
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndOpcCP_2() {
      this.indOpcCP = "2";
      return this;
    }

    /**
     * Indicativo de microempresa - ME ou empresa de pequeno porte - EPP para permissão de acesso ao
     * módulo simplificado. Não preencher caso o empregador não se enquadre como micro ou pequena
     * empresa.
     *
     * @return Conteúdo do campo indPorte
     */
    public String getIndPorte() {
      return this.indPorte;
    }

    /**
     * Indicativo de microempresa - ME ou empresa de pequeno porte - EPP para permissão de acesso ao
     * módulo simplificado. Não preencher caso o empregador não se enquadre como micro ou pequena
     * empresa.
     *
     * <p>Validação: Não preencher se {classTrib}(./classTrib) = [21, 22].
     *
     * @param indPorte Valor para atribuir ao campo indPorte
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndPorte(String indPorte) {
      if (!"S".equals(indPorte))
        throw new RuntimeException(
            "Valor " + String.valueOf(indPorte) + " inválido para o campo indPorte");
      this.indPorte = indPorte;
      return this;
    }
    /**
     * Sim
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndPorte_S() {
      this.indPorte = "S";
      return this;
    }

    /**
     * Indica se houve opção pelo registro eletrônico de empregados.
     *
     * @return Conteúdo do campo indOptRegEletron
     */
    public String getIndOptRegEletron() {
      return this.indOptRegEletron;
    }

    /**
     * Indica se houve opção pelo registro eletrônico de empregados.
     *
     * @param indOptRegEletron Valor para atribuir ao campo indOptRegEletron
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndOptRegEletron(String indOptRegEletron) {
      if (!"0".equals(indOptRegEletron) && !"1".equals(indOptRegEletron))
        throw new RuntimeException(
            "Valor "
                + String.valueOf(indOptRegEletron)
                + " inválido para o campo indOptRegEletron");
      this.indOptRegEletron = indOptRegEletron;
      return this;
    }
    /**
     * Não optou pelo registro eletrônico de empregados
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndOptRegEletron_0() {
      this.indOptRegEletron = "0";
      return this;
    }
    /**
     * Optou pelo registro eletrônico de empregados
     *
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setIndOptRegEletron_1() {
      this.indOptRegEletron = "1";
      return this;
    }

    /**
     * CNPJ do Ente Federativo Responsável - EFR.
     *
     * @return Conteúdo do campo cnpjEFR
     */
    public String getCnpjEFR() {
      return this.cnpjEFR;
    }

    /**
     * CNPJ do Ente Federativo Responsável - EFR.
     *
     * <p>Validação: Preenchimento obrigatório e exclusivo se a natureza jurídica do declarante for
     * Administração Pública (grupo [1]). Nesse caso, informar o campo com 14 (catorze) algarismos.
     *
     * <p>Informação validada no cadastro do CNPJ da RFB.
     *
     * @param cnpjEFR Valor para atribuir ao campo cnpjEFR
     * @return O próprio T_infoCadastro para continuar populando outros campos
     */
    public T_infoCadastro<T> setCnpjEFR(String cnpjEFR) {
      this.cnpjEFR = cnpjEFR;
      return this;
    }

    /**
     * Informações complementares - Empresas isentas - Dados da isenção.
     *
     * @return Conteúdo do campo dadosIsencao
     */
    public DadosIsencao getDadosIsencao() {
      return this.dadosIsencao;
    }

    /**
     * Informações complementares - Empresas isentas - Dados da isenção.
     *
     * <p>CONDICAO_GRUPO: OC (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) =
     * [80]); N (nos demais casos)
     *
     * @return O objeto DadosIsencao para população dos campos filhos
     */
    public DadosIsencao<T_infoCadastro<T>> setDadosIsencao() {
      if (this.dadosIsencao == null) {
        this.dadosIsencao = new DadosIsencao(this);
      }
      return this.dadosIsencao;
    }

    /**
     * Informações exclusivas de organismos internacionais e outras instituições extraterritoriais.
     *
     * @return Conteúdo do campo infoOrgInternacional
     */
    public InfoOrgInternacional getInfoOrgInternacional() {
      return this.infoOrgInternacional;
    }

    /**
     * Informações exclusivas de organismos internacionais e outras instituições extraterritoriais.
     *
     * <p>CONDICAO_GRUPO: O (se a natureza jurídica pertencer ao grupo [5]); N (nos demais casos)
     *
     * @return O objeto InfoOrgInternacional para população dos campos filhos
     */
    public InfoOrgInternacional<T_infoCadastro<T>> setInfoOrgInternacional() {
      if (this.infoOrgInternacional == null) {
        this.infoOrgInternacional = new InfoOrgInternacional(this);
      }
      return this.infoOrgInternacional;
    }

    public T_infoCadastro(Object pai) {
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
     * Informações complementares - Empresas isentas - Dados da isenção.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "ideMinLei",
          "nrCertif",
          "dtEmisCertif",
          "dtVencCertif",
          "nrProtRenov",
          "dtProtRenov",
          "dtDou",
          "pagDou",
        })
    public static class DadosIsencao<T> {

      /** Sigla e nome do Ministério ou lei que concedeu o certificado. */
      private String ideMinLei;

      /**
       * Número do Certificado de Entidade Beneficente de Assistência Social - CEBAS, número da
       * portaria de concessão do certificado, ou, no caso de concessão através de lei específica, o
       * número da lei.
       */
      private String nrCertif;

      /** Data de emissão do certificado/publicação da lei. */
      private javax.xml.datatype.XMLGregorianCalendar dtEmisCertif;

      /** Data de vencimento do certificado. */
      private javax.xml.datatype.XMLGregorianCalendar dtVencCertif;

      /** Número do protocolo do pedido de renovação. */
      private String nrProtRenov;

      /** Data do protocolo de renovação. */
      private javax.xml.datatype.XMLGregorianCalendar dtProtRenov;

      /** Data de publicação no Diário Oficial da União - DOU. */
      private javax.xml.datatype.XMLGregorianCalendar dtDou;

      /**
       * Número da página no DOU referente à publicação do documento de concessão do certificado.
       */
      private Integer pagDou;

      /**
       * Sigla e nome do Ministério ou lei que concedeu o certificado.
       *
       * @return Conteúdo do campo ideMinLei
       */
      public String getIdeMinLei() {
        return this.ideMinLei;
      }

      /**
       * Sigla e nome do Ministério ou lei que concedeu o certificado.
       *
       * @param ideMinLei Valor para atribuir ao campo ideMinLei
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setIdeMinLei(String ideMinLei) {
        this.ideMinLei = ideMinLei;
        return this;
      }

      /**
       * Número do Certificado de Entidade Beneficente de Assistência Social - CEBAS, número da
       * portaria de concessão do certificado, ou, no caso de concessão através de lei específica, o
       * número da lei.
       *
       * @return Conteúdo do campo nrCertif
       */
      public String getNrCertif() {
        return this.nrCertif;
      }

      /**
       * Número do Certificado de Entidade Beneficente de Assistência Social - CEBAS, número da
       * portaria de concessão do certificado, ou, no caso de concessão através de lei específica, o
       * número da lei.
       *
       * @param nrCertif Valor para atribuir ao campo nrCertif
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setNrCertif(String nrCertif) {
        this.nrCertif = nrCertif;
        return this;
      }

      /**
       * Data de emissão do certificado/publicação da lei.
       *
       * @return Conteúdo do campo dtEmisCertif
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtEmisCertif() {
        return this.dtEmisCertif;
      }

      /**
       * Data de emissão do certificado/publicação da lei.
       *
       * @param dtEmisCertif Valor para atribuir ao campo dtEmisCertif
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setDtEmisCertif(javax.xml.datatype.XMLGregorianCalendar dtEmisCertif) {
        this.dtEmisCertif = dtEmisCertif;
        return this;
      }

      /**
       * Data de vencimento do certificado.
       *
       * @return Conteúdo do campo dtVencCertif
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtVencCertif() {
        return this.dtVencCertif;
      }

      /**
       * Data de vencimento do certificado.
       *
       * <p>Validação: Não pode ser anterior a {dtEmisCertif}(./dtEmisCertif).
       *
       * @param dtVencCertif Valor para atribuir ao campo dtVencCertif
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setDtVencCertif(javax.xml.datatype.XMLGregorianCalendar dtVencCertif) {
        this.dtVencCertif = dtVencCertif;
        return this;
      }

      /**
       * Número do protocolo do pedido de renovação.
       *
       * @return Conteúdo do campo nrProtRenov
       */
      public String getNrProtRenov() {
        return this.nrProtRenov;
      }

      /**
       * Número do protocolo do pedido de renovação.
       *
       * @param nrProtRenov Valor para atribuir ao campo nrProtRenov
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setNrProtRenov(String nrProtRenov) {
        this.nrProtRenov = nrProtRenov;
        return this;
      }

      /**
       * Data do protocolo de renovação.
       *
       * @return Conteúdo do campo dtProtRenov
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtProtRenov() {
        return this.dtProtRenov;
      }

      /**
       * Data do protocolo de renovação.
       *
       * @param dtProtRenov Valor para atribuir ao campo dtProtRenov
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setDtProtRenov(javax.xml.datatype.XMLGregorianCalendar dtProtRenov) {
        this.dtProtRenov = dtProtRenov;
        return this;
      }

      /**
       * Data de publicação no Diário Oficial da União - DOU.
       *
       * @return Conteúdo do campo dtDou
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtDou() {
        return this.dtDou;
      }

      /**
       * Data de publicação no Diário Oficial da União - DOU.
       *
       * @param dtDou Valor para atribuir ao campo dtDou
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setDtDou(javax.xml.datatype.XMLGregorianCalendar dtDou) {
        this.dtDou = dtDou;
        return this;
      }

      /**
       * Número da página no DOU referente à publicação do documento de concessão do certificado.
       *
       * @return Conteúdo do campo pagDou
       */
      public Integer getPagDou() {
        return this.pagDou;
      }

      /**
       * Número da página no DOU referente à publicação do documento de concessão do certificado.
       *
       * @param pagDou Valor para atribuir ao campo pagDou
       * @return O próprio DadosIsencao para continuar populando outros campos
       */
      public DadosIsencao<T> setPagDou(Integer pagDou) {
        this.pagDou = pagDou;
        return this;
      }

      public DadosIsencao(Object pai) {
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
     * Informações exclusivas de organismos internacionais e outras instituições extraterritoriais.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "indAcordoIsenMulta",
        })
    public static class InfoOrgInternacional<T> {

      /** Indicativo da existência de acordo internacional para isenção de multa. */
      private String indAcordoIsenMulta;

      /**
       * Indicativo da existência de acordo internacional para isenção de multa.
       *
       * @return Conteúdo do campo indAcordoIsenMulta
       */
      public String getIndAcordoIsenMulta() {
        return this.indAcordoIsenMulta;
      }

      /**
       * Indicativo da existência de acordo internacional para isenção de multa.
       *
       * @param indAcordoIsenMulta Valor para atribuir ao campo indAcordoIsenMulta
       * @return O próprio InfoOrgInternacional para continuar populando outros campos
       */
      public InfoOrgInternacional<T> setIndAcordoIsenMulta(String indAcordoIsenMulta) {
        if (!"0".equals(indAcordoIsenMulta) && !"1".equals(indAcordoIsenMulta))
          throw new RuntimeException(
              "Valor "
                  + String.valueOf(indAcordoIsenMulta)
                  + " inválido para o campo indAcordoIsenMulta");
        this.indAcordoIsenMulta = indAcordoIsenMulta;
        return this;
      }
      /**
       * Sem acordo
       *
       * @return O próprio InfoOrgInternacional para continuar populando outros campos
       */
      public InfoOrgInternacional<T> setIndAcordoIsenMulta_0() {
        this.indAcordoIsenMulta = "0";
        return this;
      }
      /**
       * Com acordo
       *
       * @return O próprio InfoOrgInternacional para continuar populando outros campos
       */
      public InfoOrgInternacional<T> setIndAcordoIsenMulta_1() {
        this.indAcordoIsenMulta = "1";
        return this;
      }

      public InfoOrgInternacional(Object pai) {
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
