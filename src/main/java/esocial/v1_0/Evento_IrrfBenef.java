package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-5002 - Imposto de Renda Retido na Fonte por Trabalhador */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtIrrfBenef",
    })
@XmlRootElement(name = "eSocial")
public class Evento_IrrfBenef {

  /** Evento IRRF por Trabalhador */
  private EvtIrrfBenef evtIrrfBenef;

  /**
   * Evento IRRF por Trabalhador
   *
   * @return Conteúdo do campo evtIrrfBenef
   */
  public EvtIrrfBenef getEvtIrrfBenef() {
    return this.evtIrrfBenef;
  }

  /**
   * Evento IRRF por Trabalhador
   *
   * <p>DESCRICAO_COMPLETA:Evento Imposto de Renda Retido na Fonte por Trabalhador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * @return O objeto EvtIrrfBenef para população dos campos filhos
   */
  public EvtIrrfBenef<Evento_IrrfBenef> setEvtIrrfBenef() {
    if (this.evtIrrfBenef == null) {
      this.evtIrrfBenef = new EvtIrrfBenef(this);
    }
    return this.evtIrrfBenef;
  }

  /**
   * Evento IRRF por Trabalhador
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideTrabalhador",
      })
  public static class EvtIrrfBenef<T> {

    /** Identificação do evento de retorno. */
    private IdeEvento ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do beneficiário */
    private IdeTrabalhador ideTrabalhador;

    /**
     * Identificação do evento de retorno.
     *
     * @return Conteúdo do campo ideEvento
     */
    public IdeEvento getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Identificação do evento de retorno.
     *
     * @return O objeto IdeEvento para população dos campos filhos
     */
    public IdeEvento<EvtIrrfBenef<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new IdeEvento(this);
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
    public Tipos.T_ideEmpregador<EvtIrrfBenef<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do beneficiário
     *
     * @return Conteúdo do campo ideTrabalhador
     */
    public IdeTrabalhador getIdeTrabalhador() {
      return this.ideTrabalhador;
    }

    /**
     * Identificação do beneficiário
     *
     * <p>DESCRICAO_COMPLETA:Identificação do beneficiário do pagamento.
     *
     * <p>CHAVE_GRUPO: {cpfBenef}
     *
     * @return O objeto IdeTrabalhador para população dos campos filhos
     */
    public IdeTrabalhador<EvtIrrfBenef<T>> setIdeTrabalhador() {
      if (this.ideTrabalhador == null) {
        this.ideTrabalhador = new IdeTrabalhador(this);
      }
      return this.ideTrabalhador;
    }

    public EvtIrrfBenef(Object pai) {
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
     * Identificação do evento de retorno.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "nrRecArqBase",
          "perApur",
        })
    public static class IdeEvento<T> {

      /**
       * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno
       * ao empregador.
       */
      private String nrRecArqBase;

      /** Informar o mês/ano (formato AAAA-MM) de referência das informações. */
      private String perApur;

      /**
       * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno
       * ao empregador.
       *
       * @return Conteúdo do campo nrRecArqBase
       */
      public String getNrRecArqBase() {
        return this.nrRecArqBase;
      }

      /**
       * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno
       * ao empregador.
       *
       * <p>Validação: Deve corresponder ao recibo de um arquivo com informações de rendimentos
       * sujeitos a Imposto de Renda Retido na Fonte - IRRF (S-1210 ou S-3000).
       *
       * @param nrRecArqBase Valor para atribuir ao campo nrRecArqBase
       * @return O próprio IdeEvento para continuar populando outros campos
       */
      public IdeEvento<T> setNrRecArqBase(String nrRecArqBase) {
        this.nrRecArqBase = nrRecArqBase;
        return this;
      }

      /**
       * Informar o mês/ano (formato AAAA-MM) de referência das informações.
       *
       * @return Conteúdo do campo perApur
       */
      public String getPerApur() {
        return this.perApur;
      }

      /**
       * Informar o mês/ano (formato AAAA-MM) de referência das informações.
       *
       * @param perApur Valor para atribuir ao campo perApur
       * @return O próprio IdeEvento para continuar populando outros campos
       */
      public IdeEvento<T> setPerApur(String perApur) {
        this.perApur = perApur;
        return this;
      }

      public IdeEvento(Object pai) {
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
     * Identificação do beneficiário
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfBenef",
          "dmDev",
        })
    public static class IdeTrabalhador<T> {

      /** Número de inscrição no Cadastro de Pessoas Físicas - CPF do beneficiário do pagamento. */
      private String cpfBenef;

      /**
       * Informações do demonstrativo de valores devidos.
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       */
      private java.util.List<DmDev> dmDev;

      /**
       * Número de inscrição no Cadastro de Pessoas Físicas - CPF do beneficiário do pagamento.
       *
       * @return Conteúdo do campo cpfBenef
       */
      public String getCpfBenef() {
        return this.cpfBenef;
      }

      /**
       * Número de inscrição no Cadastro de Pessoas Físicas - CPF do beneficiário do pagamento.
       *
       * <p>Origem: campo {cpfBenef}(1210_ideBenef_cpfBenef) de S-1210.
       *
       * @param cpfBenef Valor para atribuir ao campo cpfBenef
       * @return O próprio IdeTrabalhador para continuar populando outros campos
       */
      public IdeTrabalhador<T> setCpfBenef(String cpfBenef) {
        this.cpfBenef = cpfBenef;
        return this;
      }

      /**
       * Informações do demonstrativo de valores devidos.
       *
       * @return Conteúdo do campo dmDev
       */
      public java.util.List<DmDev> getDmDev() {
        return this.dmDev;
      }

      /**
       * Informações do demonstrativo de valores devidos.
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       *
       * <p>CHAVE_GRUPO: {perRef}, {ideDmDev}, {tpPgto}
       *
       * @return O objeto DmDev para população dos campos filhos
       */
      public DmDev<IdeTrabalhador<T>> setDmDev_Next() {
        if (this.dmDev == null) {
          this.dmDev = new java.util.ArrayList<>();
        }
        DmDev toAdd = new DmDev(this);
        this.dmDev.add(toAdd);
        return toAdd;
      }

      public IdeTrabalhador(Object pai) {
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
       * Informações do demonstrativo de valores devidos.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "perRef",
            "ideDmDev",
            "tpPgto",
            "dtPgto",
            "codCateg",
            "infoIR",
          })
      public static class DmDev<T> {

        /**
         * Período de referência das informações, no formato AAAA-MM (ou AAAA, se for relativo a 13°
         * salário).
         */
        private String perRef;

        /**
         * Identificador atribuído pela fonte pagadora para o demonstrativo de valores devidos ao
         * trabalhador.
         */
        private String ideDmDev;

        /** Informar o evento de origem do pagamento. */
        private String tpPgto;

        /** Informar a data de pagamento. */
        private javax.xml.datatype.XMLGregorianCalendar dtPgto;

        /** Preencher com o código da categoria do trabalhador, conforme Tabela 01. */
        private Integer codCateg;

        /**
         * Bases, deduções, isenções e retenções do IRRF.
         *
         * <p>- Esse campo pode ser repetido até 999 vezes
         */
        private java.util.List<InfoIR> infoIR;

        /**
         * Período de referência das informações, no formato AAAA-MM (ou AAAA, se for relativo a 13°
         * salário).
         *
         * @return Conteúdo do campo perRef
         */
        public String getPerRef() {
          return this.perRef;
        }

        /**
         * Período de referência das informações, no formato AAAA-MM (ou AAAA, se for relativo a 13°
         * salário).
         *
         * <p>Origem: campo {perRef}(1210_ideBenef_infoPgto_perRef) de S-1210.
         *
         * @param perRef Valor para atribuir ao campo perRef
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setPerRef(String perRef) {
          this.perRef = perRef;
          return this;
        }

        /**
         * Identificador atribuído pela fonte pagadora para o demonstrativo de valores devidos ao
         * trabalhador.
         *
         * @return Conteúdo do campo ideDmDev
         */
        public String getIdeDmDev() {
          return this.ideDmDev;
        }

        /**
         * Identificador atribuído pela fonte pagadora para o demonstrativo de valores devidos ao
         * trabalhador.
         *
         * <p>Origem: campo {ideDmDev}(1210_ideBenef_infoPgto_ideDmDev) de S-1210.
         *
         * @param ideDmDev Valor para atribuir ao campo ideDmDev
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setIdeDmDev(String ideDmDev) {
          this.ideDmDev = ideDmDev;
          return this;
        }

        /**
         * Informar o evento de origem do pagamento.
         *
         * @return Conteúdo do campo tpPgto
         */
        public String getTpPgto() {
          return this.tpPgto;
        }

        /**
         * Informar o evento de origem do pagamento.
         *
         * <p>Origem: campo {tpPgto}(1210_ideBenef_infoPgto_tpPgto) de S-1210.
         *
         * @param tpPgto Valor para atribuir ao campo tpPgto
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setTpPgto(String tpPgto) {
          if (!"1".equals(tpPgto)
              && !"2".equals(tpPgto)
              && !"3".equals(tpPgto)
              && !"4".equals(tpPgto)
              && !"5".equals(tpPgto))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpPgto) + " inválido para o campo tpPgto");
          this.tpPgto = tpPgto;
          return this;
        }
        /**
         * S-1200
         *
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setTpPgto_1() {
          this.tpPgto = "1";
          return this;
        }
        /**
         * S-2299
         *
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setTpPgto_2() {
          this.tpPgto = "2";
          return this;
        }
        /**
         * S-2399
         *
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setTpPgto_3() {
          this.tpPgto = "3";
          return this;
        }
        /**
         * S-1202
         *
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setTpPgto_4() {
          this.tpPgto = "4";
          return this;
        }
        /**
         * S-1207
         *
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setTpPgto_5() {
          this.tpPgto = "5";
          return this;
        }

        /**
         * Informar a data de pagamento.
         *
         * @return Conteúdo do campo dtPgto
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtPgto() {
          return this.dtPgto;
        }

        /**
         * Informar a data de pagamento.
         *
         * <p>Origem: campo {dtPgto}(1210_ideBenef_infoPgto_dtPgto) de S-1210.
         *
         * @param dtPgto Valor para atribuir ao campo dtPgto
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setDtPgto(javax.xml.datatype.XMLGregorianCalendar dtPgto) {
          this.dtPgto = dtPgto;
          return this;
        }

        /**
         * Preencher com o código da categoria do trabalhador, conforme Tabela 01.
         *
         * @return Conteúdo do campo codCateg
         */
        public Integer getCodCateg() {
          return this.codCateg;
        }

        /**
         * Preencher com o código da categoria do trabalhador, conforme Tabela 01.
         *
         * <p>Validação: a) Se {tpPgto}(./tpPgto) = [1, 4], retornar o código de categoria informado
         * no evento de origem;
         *
         * <p>b) Se {tpPgto}(./tpPgto) = [2, 3], retornar o código de categoria existente no
         * Registro de Eventos Trabalhistas - RET;
         *
         * <p>c) Se {tpPgto}(./tpPgto) = [5], retornar [000].
         *
         * @param codCateg Valor para atribuir ao campo codCateg
         * @return O próprio DmDev para continuar populando outros campos
         */
        public DmDev<T> setCodCateg(Integer codCateg) {
          this.codCateg = codCateg;
          return this;
        }

        /**
         * Bases, deduções, isenções e retenções do IRRF.
         *
         * @return Conteúdo do campo infoIR
         */
        public java.util.List<InfoIR> getInfoIR() {
          return this.infoIR;
        }

        /**
         * Bases, deduções, isenções e retenções do IRRF.
         *
         * <p>- Esse campo pode ser repetido até 999 vezes
         *
         * @return O objeto InfoIR para população dos campos filhos
         */
        public InfoIR<DmDev<T>> setInfoIR_Next() {
          if (this.infoIR == null) {
            this.infoIR = new java.util.ArrayList<>();
          }
          InfoIR toAdd = new InfoIR(this);
          this.infoIR.add(toAdd);
          return toAdd;
        }

        public DmDev(Object pai) {
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
         * Bases, deduções, isenções e retenções do IRRF.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpInfoIR",
              "valor",
            })
        public static class InfoIR<T> {

          /** Consolidação dos tipos de valores relativos ao IRRF. */
          private Integer tpInfoIR;

          /**
           * Composição do valor do rendimento tributável, não tributável, retenção, dedução ou
           * isenção do IRRF, de acordo com a classificação apresentada no campo
           * {tpInfoIR}(./tpInfoIR).
           */
          private Double valor;

          /**
           * Consolidação dos tipos de valores relativos ao IRRF.
           *
           * @return Conteúdo do campo tpInfoIR
           */
          public Integer getTpInfoIR() {
            return this.tpInfoIR;
          }

          /**
           * Consolidação dos tipos de valores relativos ao IRRF.
           *
           * @param tpInfoIR Valor para atribuir ao campo tpInfoIR
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR(Integer tpInfoIR) {
            if (!"11".equals(tpInfoIR)
                && !"12".equals(tpInfoIR)
                && !"14".equals(tpInfoIR)
                && !"31".equals(tpInfoIR)
                && !"32".equals(tpInfoIR)
                && !"34".equals(tpInfoIR)
                && !"41".equals(tpInfoIR)
                && !"42".equals(tpInfoIR)
                && !"46".equals(tpInfoIR)
                && !"47".equals(tpInfoIR)
                && !"51".equals(tpInfoIR)
                && !"52".equals(tpInfoIR)
                && !"54".equals(tpInfoIR)
                && !"61".equals(tpInfoIR)
                && !"62".equals(tpInfoIR)
                && !"63".equals(tpInfoIR)
                && !"64".equals(tpInfoIR)
                && !"67".equals(tpInfoIR)
                && !"70".equals(tpInfoIR)
                && !"71".equals(tpInfoIR)
                && !"72".equals(tpInfoIR)
                && !"73".equals(tpInfoIR)
                && !"74".equals(tpInfoIR)
                && !"75".equals(tpInfoIR)
                && !"76".equals(tpInfoIR)
                && !"77".equals(tpInfoIR)
                && !"700".equals(tpInfoIR)
                && !"701".equals(tpInfoIR)
                && !"79".equals(tpInfoIR)
                && !"7900".equals(tpInfoIR)
                && !"7950".equals(tpInfoIR)
                && !"7951".equals(tpInfoIR)
                && !"7952".equals(tpInfoIR)
                && !"7953".equals(tpInfoIR)
                && !"7954".equals(tpInfoIR)
                && !"7955".equals(tpInfoIR)
                && !"7956".equals(tpInfoIR)
                && !"7957".equals(tpInfoIR)
                && !"7958".equals(tpInfoIR)
                && !"7959".equals(tpInfoIR)
                && !"7960".equals(tpInfoIR)
                && !"7961".equals(tpInfoIR)
                && !"7962".equals(tpInfoIR)
                && !"7963".equals(tpInfoIR)
                && !"7964".equals(tpInfoIR)
                && !"9011".equals(tpInfoIR)
                && !"9012".equals(tpInfoIR)
                && !"9014".equals(tpInfoIR)
                && !"9031".equals(tpInfoIR)
                && !"9032".equals(tpInfoIR)
                && !"9034".equals(tpInfoIR)
                && !"9831".equals(tpInfoIR)
                && !"9832".equals(tpInfoIR)
                && !"9834".equals(tpInfoIR)
                && !"9041".equals(tpInfoIR)
                && !"9042".equals(tpInfoIR)
                && !"9046".equals(tpInfoIR)
                && !"9047".equals(tpInfoIR)
                && !"9051".equals(tpInfoIR)
                && !"9052".equals(tpInfoIR)
                && !"9054".equals(tpInfoIR)
                && !"9061".equals(tpInfoIR)
                && !"9062".equals(tpInfoIR)
                && !"9063".equals(tpInfoIR)
                && !"9064".equals(tpInfoIR)
                && !"9067".equals(tpInfoIR)
                && !"9082".equals(tpInfoIR)
                && !"9083".equals(tpInfoIR))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpInfoIR) + " inválido para o campo tpInfoIR");
            this.tpInfoIR = tpInfoIR;
            return this;
          }
          /**
           * Rendimentos tributáveis:
           *
           * <p>Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_11() {
            this.tpInfoIR = "11";
            return this;
          }
          /**
           * 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_12() {
            this.tpInfoIR = "12";
            return this;
          }
          /**
           * PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_14() {
            this.tpInfoIR = "14";
            return this;
          }
          /**
           * Retenções do IRRF efetuadas sobre:
           *
           * <p>Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_31() {
            this.tpInfoIR = "31";
            return this;
          }
          /**
           * 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_32() {
            this.tpInfoIR = "32";
            return this;
          }
          /**
           * PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_34() {
            this.tpInfoIR = "34";
            return this;
          }
          /**
           * Deduções da base de cálculo do IRRF:
           *
           * <p>Previdência Social Oficial - PSO - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_41() {
            this.tpInfoIR = "41";
            return this;
          }
          /**
           * PSO - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_42() {
            this.tpInfoIR = "42";
            return this;
          }
          /**
           * Previdência privada - Salário mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_46() {
            this.tpInfoIR = "46";
            return this;
          }
          /**
           * Previdência privada - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_47() {
            this.tpInfoIR = "47";
            return this;
          }
          /**
           * Pensão alimentícia - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_51() {
            this.tpInfoIR = "51";
            return this;
          }
          /**
           * Pensão alimentícia - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_52() {
            this.tpInfoIR = "52";
            return this;
          }
          /**
           * Pensão alimentícia - PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_54() {
            this.tpInfoIR = "54";
            return this;
          }
          /**
           * Fundo de Aposentadoria Programada Individual - FAPI - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_61() {
            this.tpInfoIR = "61";
            return this;
          }
          /**
           * Fundo de Aposentadoria Programada Individual - FAPI - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_62() {
            this.tpInfoIR = "62";
            return this;
          }
          /**
           * Fundação de previdência complementar do servidor público - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_63() {
            this.tpInfoIR = "63";
            return this;
          }
          /**
           * Fundação de previdência complementar do servidor público - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_64() {
            this.tpInfoIR = "64";
            return this;
          }
          /**
           * Plano privado coletivo de assistência à saúde
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_67() {
            this.tpInfoIR = "67";
            return this;
          }
          /**
           * Rendimento não tributável ou isento do IRRF:
           *
           * <p>Parcela isenta 65 anos - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_70() {
            this.tpInfoIR = "70";
            return this;
          }
          /**
           * Parcela isenta 65 anos - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_71() {
            this.tpInfoIR = "71";
            return this;
          }
          /**
           * Diárias
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_72() {
            this.tpInfoIR = "72";
            return this;
          }
          /**
           * Ajuda de custo
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_73() {
            this.tpInfoIR = "73";
            return this;
          }
          /**
           * Indenização e rescisão de contrato, inclusive a título de PDV e acidentes de trabalho
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_74() {
            this.tpInfoIR = "74";
            return this;
          }
          /**
           * Abono pecuniário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_75() {
            this.tpInfoIR = "75";
            return this;
          }
          /**
           * Rendimento de beneficiário com moléstia grave ou acidente em serviço - Remuneração
           * mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_76() {
            this.tpInfoIR = "76";
            return this;
          }
          /**
           * Rendimento de beneficiário com moléstia grave ou acidente em serviço - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_77() {
            this.tpInfoIR = "77";
            return this;
          }
          /**
           * Auxílio moradia
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_700() {
            this.tpInfoIR = "700";
            return this;
          }
          /**
           * Parte não tributável do valor de serviço de transporte de passageiros ou cargas
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_701() {
            this.tpInfoIR = "701";
            return this;
          }
          /**
           * Outras isenções
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_79() {
            this.tpInfoIR = "79";
            return this;
          }
          /**
           * Verba transitada pela folha de pagamento de natureza diversa de rendimento ou
           * retenção/isenção/dedução de IR (exemplo: desconto de convênio farmácia, desconto de
           * consignações, etc.)
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7900() {
            this.tpInfoIR = "7900";
            return this;
          }
          /**
           * Códigos para compatibilidade de versões anteriores:
           *
           * <p>Rendimento não tributável
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7950() {
            this.tpInfoIR = "7950";
            return this;
          }
          /**
           * Rendimento não tributável em função de acordos internacionais de bitributação
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7951() {
            this.tpInfoIR = "7951";
            return this;
          }
          /**
           * Rendimento tributável - RRA
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7952() {
            this.tpInfoIR = "7952";
            return this;
          }
          /**
           * Retenção de IR - RRA
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7953() {
            this.tpInfoIR = "7953";
            return this;
          }
          /**
           * Previdência Social Oficial - RRA
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7954() {
            this.tpInfoIR = "7954";
            return this;
          }
          /**
           * Pensão alimentícia - RRA
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7955() {
            this.tpInfoIR = "7955";
            return this;
          }
          /**
           * Valores pagos a titular ou sócio de microempresa ou empresa de pequeno porte, exceto
           * pró-labore e aluguéis
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7956() {
            this.tpInfoIR = "7956";
            return this;
          }
          /**
           * Depósito judicial
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7957() {
            this.tpInfoIR = "7957";
            return this;
          }
          /**
           * Compensação judicial do ano-calendário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7958() {
            this.tpInfoIR = "7958";
            return this;
          }
          /**
           * Compensação judicial de anos anteriores
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7959() {
            this.tpInfoIR = "7959";
            return this;
          }
          /**
           * Exigibilidade suspensa - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7960() {
            this.tpInfoIR = "7960";
            return this;
          }
          /**
           * Exigibilidade suspensa - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7961() {
            this.tpInfoIR = "7961";
            return this;
          }
          /**
           * Exigibilidade suspensa - Férias
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7962() {
            this.tpInfoIR = "7962";
            return this;
          }
          /**
           * Exigibilidade suspensa - PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7963() {
            this.tpInfoIR = "7963";
            return this;
          }
          /**
           * Exigibilidade suspensa - RRA
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_7964() {
            this.tpInfoIR = "7964";
            return this;
          }
          /**
           * Exigibilidade suspensa - Rendimento tributável (base de cálculo do IR):
           *
           * <p>Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9011() {
            this.tpInfoIR = "9011";
            return this;
          }
          /**
           * 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9012() {
            this.tpInfoIR = "9012";
            return this;
          }
          /**
           * PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9014() {
            this.tpInfoIR = "9014";
            return this;
          }
          /**
           * Exigibilidade suspensa - Retenção do IRRF efetuada sobre:
           *
           * <p>Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9031() {
            this.tpInfoIR = "9031";
            return this;
          }
          /**
           * 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9032() {
            this.tpInfoIR = "9032";
            return this;
          }
          /**
           * PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9034() {
            this.tpInfoIR = "9034";
            return this;
          }
          /**
           * Depósito judicial - Mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9831() {
            this.tpInfoIR = "9831";
            return this;
          }
          /**
           * Depósito judicial - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9832() {
            this.tpInfoIR = "9832";
            return this;
          }
          /**
           * Depósito judicial - PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9834() {
            this.tpInfoIR = "9834";
            return this;
          }
          /**
           * Exigibilidade suspensa - Dedução da base de cálculo do IRRF:
           *
           * <p>Previdência Social Oficial - PSO - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9041() {
            this.tpInfoIR = "9041";
            return this;
          }
          /**
           * PSO - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9042() {
            this.tpInfoIR = "9042";
            return this;
          }
          /**
           * Previdência privada - Salário mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9046() {
            this.tpInfoIR = "9046";
            return this;
          }
          /**
           * Previdência privada - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9047() {
            this.tpInfoIR = "9047";
            return this;
          }
          /**
           * Pensão alimentícia - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9051() {
            this.tpInfoIR = "9051";
            return this;
          }
          /**
           * Pensão alimentícia - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9052() {
            this.tpInfoIR = "9052";
            return this;
          }
          /**
           * Pensão alimentícia - PLR
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9054() {
            this.tpInfoIR = "9054";
            return this;
          }
          /**
           * Fundo de Aposentadoria Programada Individual - FAPI - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9061() {
            this.tpInfoIR = "9061";
            return this;
          }
          /**
           * Fundo de Aposentadoria Programada Individual - FAPI - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9062() {
            this.tpInfoIR = "9062";
            return this;
          }
          /**
           * Fundação de previdência complementar do servidor público - Remuneração mensal
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9063() {
            this.tpInfoIR = "9063";
            return this;
          }
          /**
           * Fundação de previdência complementar do servidor público - 13º salário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9064() {
            this.tpInfoIR = "9064";
            return this;
          }
          /**
           * Plano privado coletivo de assistência à saúde
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9067() {
            this.tpInfoIR = "9067";
            return this;
          }
          /**
           * Compensação judicial:
           *
           * <p>Compensação judicial do ano-calendário
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9082() {
            this.tpInfoIR = "9082";
            return this;
          }
          /**
           * Compensação judicial de anos anteriores
           *
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setTpInfoIR_9083() {
            this.tpInfoIR = "9083";
            return this;
          }

          /**
           * Composição do valor do rendimento tributável, não tributável, retenção, dedução ou
           * isenção do IRRF, de acordo com a classificação apresentada no campo
           * {tpInfoIR}(./tpInfoIR).
           *
           * @return Conteúdo do campo valor
           */
          public Double getValor() {
            return this.valor;
          }

          /**
           * Composição do valor do rendimento tributável, não tributável, retenção, dedução ou
           * isenção do IRRF, de acordo com a classificação apresentada no campo
           * {tpInfoIR}(./tpInfoIR).
           *
           * <p>Validação: Deve corresponder ao somatório dos valores informados nas rubricas (campo
           * {vrRubr}) dos eventos de origem do S-1210 (grupos {infoPerApur} e {infoPerAnt} do
           * S-1200, S-1202, S-1207 e S-2299, e grupo {verbasResc} do S-2399), desde que o campo
           * {indApurIR} vinculado às respectivas rubricas seja igual a [0] ou não informado,
           * obedecendo ao que segue:
           *
           * <p>a) Somar os valores das rubricas cujo
           * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [1, 3] e
           * subtrair os valores das rubricas cujo
           * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [2, 4],
           * observando a tabela de relacionamento abaixo:
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [11],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [11, 13];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [12],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [12];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [14],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [14];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [70],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [70];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [71],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [71];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [72],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [72];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [73],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [73];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [74],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [74];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [75],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [75];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [76],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [76];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [77],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [77];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [700],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [700];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [701],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [701];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [79],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [79];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7900],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7950],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [0];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7951],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [1];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7952],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [15];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7956],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [78];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7960],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [91];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7961],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [92];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7962],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [93];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7963],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [94];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7964],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [95];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9011],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9011,
           * 9013];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9012],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9012];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9014],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9014].
           *
           * <p>
           *
           * <p>b) Somar os valores das rubricas cujo
           * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [2, 4] e
           * subtrair os valores das rubricas cujo
           * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [1, 3],
           * observando a tabela de relacionamento abaixo:
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [31],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [31, 33];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [32],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [32];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [34],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [34];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [41],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [41, 43];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [42],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [42];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [46],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [46, 48];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [47],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [47];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [51],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [51, 53];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [52],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [52];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [54],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [54];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [61],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [61, 66];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [62],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [62];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [63],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [63, 65];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [64],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [64];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [67],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [67];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7953],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [35];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7954],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [44];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7955],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [55];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7957],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [81];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7958],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [82];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [7959],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [83];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9031],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9031,
           * 9033];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9032],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9032];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9034],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9034];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9831],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9831,
           * 9833];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9832],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9832];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9834],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9834];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9041],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9041,
           * 9043];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9042],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9042];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9046],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9046,
           * 9048];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9047],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9047];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9051],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9051,
           * 9053];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9052],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9052];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9054],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9054];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9061],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9061,
           * 9066];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9062],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9062];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9063],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9063,
           * 9065];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9064],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9064];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9067],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9067];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9082],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9082];
           *
           * <p>{tpInfoIR}(./tpInfoIR) = [9083],
           * {codIncIRRF}(1010_infoRubrica_inclusao_dadosRubrica_codIncIRRF) em S-1010 = [9083].
           *
           * @param valor Valor para atribuir ao campo valor
           * @return O próprio InfoIR para continuar populando outros campos
           */
          public InfoIR<T> setValor(Double valor) {
            this.valor = valor;
            return this;
          }

          public InfoIR(Object pai) {
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
