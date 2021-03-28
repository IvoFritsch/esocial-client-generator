package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2416 - Cadastro de Benefício - Entes Públicos - Alteração */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCdBenAlt",
    })
@XmlRootElement(name = "eSocial")
public class Evento_CdBenAlt {

  /** Evento Cadastro de Benefício - Alteração */
  private EvtCdBenAlt evtCdBenAlt;

  /**
   * Evento Cadastro de Benefício - Alteração
   *
   * @return Conteúdo do campo evtCdBenAlt
   */
  public EvtCdBenAlt getEvtCdBenAlt() {
    return this.evtCdBenAlt;
  }

  /**
   * Evento Cadastro de Benefício - Alteração
   *
   * <p>DESCRICAO_COMPLETA:Evento Cadastro de Benefício - Entes Públicos - Alteração.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ALTERA_TIPO_BENEFICIO
   *
   * <p>REGRA:REGRA_BENEFICIO_ATIVO_NA_DTEVENTO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_REATIVACAO
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_BENEFICIO
   *
   * @return O objeto EvtCdBenAlt para população dos campos filhos
   */
  public EvtCdBenAlt<Evento_CdBenAlt> setEvtCdBenAlt() {
    if (this.evtCdBenAlt == null) {
      this.evtCdBenAlt = new EvtCdBenAlt(this);
    }
    return this.evtCdBenAlt;
  }

  /**
   * Evento Cadastro de Benefício - Alteração
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideBeneficio",
        "infoBenAlteracao",
      })
  public static class EvtCdBenAlt<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

    /** Identificação do beneficiário e do benefício. */
    private Tipos.T_ideBeneficio ideBeneficio;

    /** Informações do benefício - Alteração. */
    private InfoBenAlteracao infoBenAlteracao;

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
    public Tipos.T_ideEvento_trab<EvtCdBenAlt<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador_cnpj getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador_cnpj para população dos campos filhos
     */
    public Tipos.T_ideEmpregador_cnpj<EvtCdBenAlt<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador_cnpj(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do beneficiário e do benefício.
     *
     * @return Conteúdo do campo ideBeneficio
     */
    public Tipos.T_ideBeneficio getIdeBeneficio() {
      return this.ideBeneficio;
    }

    /**
     * Identificação do beneficiário e do benefício.
     *
     * <p>CHAVE_GRUPO: {cpfBenef}, {nrBeneficio}
     *
     * @return O objeto Tipos.T_ideBeneficio para população dos campos filhos
     */
    public Tipos.T_ideBeneficio<EvtCdBenAlt<T>> setIdeBeneficio() {
      if (this.ideBeneficio == null) {
        this.ideBeneficio = new Tipos.T_ideBeneficio(this);
      }
      return this.ideBeneficio;
    }

    /**
     * Informações do benefício - Alteração.
     *
     * @return Conteúdo do campo infoBenAlteracao
     */
    public InfoBenAlteracao getInfoBenAlteracao() {
      return this.infoBenAlteracao;
    }

    /**
     * Informações do benefício - Alteração.
     *
     * <p>CHAVE_GRUPO: {dtAltBeneficio}
     *
     * @return O objeto InfoBenAlteracao para população dos campos filhos
     */
    public InfoBenAlteracao<EvtCdBenAlt<T>> setInfoBenAlteracao() {
      if (this.infoBenAlteracao == null) {
        this.infoBenAlteracao = new InfoBenAlteracao(this);
      }
      return this.infoBenAlteracao;
    }

    public EvtCdBenAlt(Object pai) {
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
     * Informações do benefício - Alteração.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtAltBeneficio",
          "dadosBeneficio",
        })
    public static class InfoBenAlteracao<T> {

      /** Data de alteração das informações relativas ao benefício. */
      private javax.xml.datatype.XMLGregorianCalendar dtAltBeneficio;

      /** Dados relativos ao benefício. */
      private DadosBeneficio dadosBeneficio;

      /**
       * Data de alteração das informações relativas ao benefício.
       *
       * @return Conteúdo do campo dtAltBeneficio
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAltBeneficio() {
        return this.dtAltBeneficio;
      }

      /**
       * Data de alteração das informações relativas ao benefício.
       *
       * <p>Validação: Deve ser igual ou anterior à data atual.
       *
       * @param dtAltBeneficio Valor para atribuir ao campo dtAltBeneficio
       * @return O próprio InfoBenAlteracao para continuar populando outros campos
       */
      public InfoBenAlteracao<T> setDtAltBeneficio(
          javax.xml.datatype.XMLGregorianCalendar dtAltBeneficio) {
        this.dtAltBeneficio = dtAltBeneficio;
        return this;
      }

      /**
       * Dados relativos ao benefício.
       *
       * @return Conteúdo do campo dadosBeneficio
       */
      public DadosBeneficio getDadosBeneficio() {
        return this.dadosBeneficio;
      }

      /**
       * Dados relativos ao benefício.
       *
       * @return O objeto DadosBeneficio para população dos campos filhos
       */
      public DadosBeneficio<InfoBenAlteracao<T>> setDadosBeneficio() {
        if (this.dadosBeneficio == null) {
          this.dadosBeneficio = new DadosBeneficio(this);
        }
        return this.dadosBeneficio;
      }

      public InfoBenAlteracao(Object pai) {
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
       * Dados relativos ao benefício.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpBeneficio",
            "tpPlanRP",
            "dsc",
            "indSuspensao",
            "infoPenMorte",
            "suspensao",
          })
      public static class DadosBeneficio<T> {

        /** Tipo de benefício. */
        private Integer tpBeneficio;

        /** Tipo de plano de segregação da massa. */
        private String tpPlanRP;

        /** Descrição do instrumento ou situação que originou o pagamento do benefício. */
        private String dsc;

        /** Indicativo de suspensão do benefício. */
        private String indSuspensao;

        /** Informações relativas à pensão por morte. */
        private InfoPenMorte infoPenMorte;

        /** Informações referentes à suspensão do benefício. */
        private Suspensao suspensao;

        /**
         * Tipo de benefício.
         *
         * @return Conteúdo do campo tpBeneficio
         */
        public Integer getTpBeneficio() {
          return this.tpBeneficio;
        }

        /**
         * Tipo de benefício.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 25. Se
         * {cadIni}(2410_infoBenInicio_cadIni) em S-2410 for igual a [N], não é permitido utilizar
         * código do grupo [08] dessa tabela.
         *
         * @param tpBeneficio Valor para atribuir ao campo tpBeneficio
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpBeneficio(Integer tpBeneficio) {
          this.tpBeneficio = tpBeneficio;
          return this;
        }

        /**
         * Tipo de plano de segregação da massa.
         *
         * @return Conteúdo do campo tpPlanRP
         */
        public String getTpPlanRP() {
          return this.tpPlanRP;
        }

        /**
         * Tipo de plano de segregação da massa.
         *
         * @param tpPlanRP Valor para atribuir ao campo tpPlanRP
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP(String tpPlanRP) {
          if (!"0".equals(tpPlanRP)
              && !"1".equals(tpPlanRP)
              && !"2".equals(tpPlanRP)
              && !"3".equals(tpPlanRP))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpPlanRP) + " inválido para o campo tpPlanRP");
          this.tpPlanRP = tpPlanRP;
          return this;
        }
        /**
         * Sem segregação da massa
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_0() {
          this.tpPlanRP = "0";
          return this;
        }
        /**
         * Fundo em capitalização
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_1() {
          this.tpPlanRP = "1";
          return this;
        }
        /**
         * Fundo em repartição
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_2() {
          this.tpPlanRP = "2";
          return this;
        }
        /**
         * Mantido pelo Tesouro
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_3() {
          this.tpPlanRP = "3";
          return this;
        }

        /**
         * Descrição do instrumento ou situação que originou o pagamento do benefício.
         *
         * @return Conteúdo do campo dsc
         */
        public String getDsc() {
          return this.dsc;
        }

        /**
         * Descrição do instrumento ou situação que originou o pagamento do benefício.
         *
         * <p>Validação: Preenchimento obrigatório se {tpBeneficio}(./tpBeneficio) = [0909, 1001,
         * 1009].
         *
         * @param dsc Valor para atribuir ao campo dsc
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setDsc(String dsc) {
          this.dsc = dsc;
          return this;
        }

        /**
         * Indicativo de suspensão do benefício.
         *
         * @return Conteúdo do campo indSuspensao
         */
        public String getIndSuspensao() {
          return this.indSuspensao;
        }

        /**
         * Indicativo de suspensão do benefício.
         *
         * @param indSuspensao Valor para atribuir ao campo indSuspensao
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setIndSuspensao(String indSuspensao) {
          if (!"S".equals(indSuspensao) && !"N".equals(indSuspensao))
            throw new RuntimeException(
                "Valor " + String.valueOf(indSuspensao) + " inválido para o campo indSuspensao");
          this.indSuspensao = indSuspensao;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setIndSuspensao_S() {
          this.indSuspensao = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setIndSuspensao_N() {
          this.indSuspensao = "N";
          return this;
        }

        /**
         * Informações relativas à pensão por morte.
         *
         * @return Conteúdo do campo infoPenMorte
         */
        public InfoPenMorte getInfoPenMorte() {
          return this.infoPenMorte;
        }

        /**
         * Informações relativas à pensão por morte.
         *
         * <p>CONDICAO_GRUPO: O (se {tpBeneficio}(../tpBeneficio) pertencer ao grupo [06]); N (nos
         * demais casos)
         *
         * @return O objeto InfoPenMorte para população dos campos filhos
         */
        public InfoPenMorte<DadosBeneficio<T>> setInfoPenMorte() {
          if (this.infoPenMorte == null) {
            this.infoPenMorte = new InfoPenMorte(this);
          }
          return this.infoPenMorte;
        }

        /**
         * Informações referentes à suspensão do benefício.
         *
         * @return Conteúdo do campo suspensao
         */
        public Suspensao getSuspensao() {
          return this.suspensao;
        }

        /**
         * Informações referentes à suspensão do benefício.
         *
         * <p>CONDICAO_GRUPO: O (se {indSuspensao}(../indSuspensao) = [S]; N (se
         * {indSuspensao}(../indSuspensao) = [N]
         *
         * @return O objeto Suspensao para população dos campos filhos
         */
        public Suspensao<DadosBeneficio<T>> setSuspensao() {
          if (this.suspensao == null) {
            this.suspensao = new Suspensao(this);
          }
          return this.suspensao;
        }

        public DadosBeneficio(Object pai) {
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
         * Informações relativas à pensão por morte.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpPenMorte",
            })
        public static class InfoPenMorte<T> {

          /** Tipo de pensão por morte. */
          private String tpPenMorte;

          /**
           * Tipo de pensão por morte.
           *
           * @return Conteúdo do campo tpPenMorte
           */
          public String getTpPenMorte() {
            return this.tpPenMorte;
          }

          /**
           * Tipo de pensão por morte.
           *
           * @param tpPenMorte Valor para atribuir ao campo tpPenMorte
           * @return O próprio InfoPenMorte para continuar populando outros campos
           */
          public InfoPenMorte<T> setTpPenMorte(String tpPenMorte) {
            if (!"1".equals(tpPenMorte) && !"2".equals(tpPenMorte))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpPenMorte) + " inválido para o campo tpPenMorte");
            this.tpPenMorte = tpPenMorte;
            return this;
          }
          /**
           * Vitalícia
           *
           * @return O próprio InfoPenMorte para continuar populando outros campos
           */
          public InfoPenMorte<T> setTpPenMorte_1() {
            this.tpPenMorte = "1";
            return this;
          }
          /**
           * Temporária
           *
           * @return O próprio InfoPenMorte para continuar populando outros campos
           */
          public InfoPenMorte<T> setTpPenMorte_2() {
            this.tpPenMorte = "2";
            return this;
          }

          public InfoPenMorte(Object pai) {
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
         * Informações referentes à suspensão do benefício.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "mtvSuspensao",
              "dscSuspensao",
            })
        public static class Suspensao<T> {

          /** Motivo da suspensão do benefício. */
          private String mtvSuspensao;

          /** Descrição do motivo da suspensão do benefício. */
          private String dscSuspensao;

          /**
           * Motivo da suspensão do benefício.
           *
           * @return Conteúdo do campo mtvSuspensao
           */
          public String getMtvSuspensao() {
            return this.mtvSuspensao;
          }

          /**
           * Motivo da suspensão do benefício.
           *
           * @param mtvSuspensao Valor para atribuir ao campo mtvSuspensao
           * @return O próprio Suspensao para continuar populando outros campos
           */
          public Suspensao<T> setMtvSuspensao(String mtvSuspensao) {
            if (!"01".equals(mtvSuspensao) && !"99".equals(mtvSuspensao))
              throw new RuntimeException(
                  "Valor " + String.valueOf(mtvSuspensao) + " inválido para o campo mtvSuspensao");
            this.mtvSuspensao = mtvSuspensao;
            return this;
          }
          /**
           * Suspensão por não recadastramento
           *
           * @return O próprio Suspensao para continuar populando outros campos
           */
          public Suspensao<T> setMtvSuspensao_01() {
            this.mtvSuspensao = "01";
            return this;
          }
          /**
           * Outros motivos de suspensão
           *
           * @return O próprio Suspensao para continuar populando outros campos
           */
          public Suspensao<T> setMtvSuspensao_99() {
            this.mtvSuspensao = "99";
            return this;
          }

          /**
           * Descrição do motivo da suspensão do benefício.
           *
           * @return Conteúdo do campo dscSuspensao
           */
          public String getDscSuspensao() {
            return this.dscSuspensao;
          }

          /**
           * Descrição do motivo da suspensão do benefício.
           *
           * <p>Validação: Preenchimento obrigatório e exclusivo se {mtvSuspensao}(./mtvSuspensao) =
           * [99].
           *
           * @param dscSuspensao Valor para atribuir ao campo dscSuspensao
           * @return O próprio Suspensao para continuar populando outros campos
           */
          public Suspensao<T> setDscSuspensao(String dscSuspensao) {
            this.dscSuspensao = dscSuspensao;
            return this;
          }

          public Suspensao(Object pai) {
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
