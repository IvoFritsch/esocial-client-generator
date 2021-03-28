package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1210 - Pagamentos de Rendimentos do Trabalho */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtPgtos",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Pgtos {

  /** Evento Pagamentos de Rendimentos do Trabalho. */
  private EvtPgtos evtPgtos;

  /**
   * Evento Pagamentos de Rendimentos do Trabalho.
   *
   * @return Conteúdo do campo evtPgtos
   */
  public EvtPgtos getEvtPgtos() {
    return this.evtPgtos;
  }

  /**
   * Evento Pagamentos de Rendimentos do Trabalho.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_CONTROLE_DUPLICIDADE
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVE_FOPAG_SIMPLIFICADO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_PAGTO_IND_RETIFICACAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_PGTO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_PER_APUR_PGTO
   *
   * @return O objeto EvtPgtos para população dos campos filhos
   */
  public EvtPgtos<Evento_Pgtos> setEvtPgtos() {
    if (this.evtPgtos == null) {
      this.evtPgtos = new EvtPgtos(this);
    }
    return this.evtPgtos;
  }

  /**
   * Evento Pagamentos de Rendimentos do Trabalho.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideBenef",
      })
  public static class EvtPgtos<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha_mensal ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do beneficiário do pagamento. */
    private IdeBenef ideBenef;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_folha_mensal getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * <p>CHAVE_GRUPO: {perApur}, {indGuia}
     *
     * @return O objeto Tipos.T_ideEvento_folha_mensal para população dos campos filhos
     */
    public Tipos.T_ideEvento_folha_mensal<EvtPgtos<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_folha_mensal(this);
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
    public Tipos.T_ideEmpregador<EvtPgtos<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do beneficiário do pagamento.
     *
     * @return Conteúdo do campo ideBenef
     */
    public IdeBenef getIdeBenef() {
      return this.ideBenef;
    }

    /**
     * Identificação do beneficiário do pagamento.
     *
     * <p>CHAVE_GRUPO: {cpfBenef}
     *
     * @return O objeto IdeBenef para população dos campos filhos
     */
    public IdeBenef<EvtPgtos<T>> setIdeBenef() {
      if (this.ideBenef == null) {
        this.ideBenef = new IdeBenef(this);
      }
      return this.ideBenef;
    }

    public EvtPgtos(Object pai) {
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
     * Identificação do beneficiário do pagamento.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfBenef",
          "infoPgto",
        })
    public static class IdeBenef<T> {

      /** Informar o CPF do beneficiário. */
      private String cpfBenef;

      /**
       * Informações dos pagamentos efetuados.
       *
       * <p>- Esse campo pode ser repetido até 999 vezes
       */
      private java.util.List<InfoPgto> infoPgto;

      /**
       * Informar o CPF do beneficiário.
       *
       * @return Conteúdo do campo cpfBenef
       */
      public String getCpfBenef() {
        return this.cpfBenef;
      }

      /**
       * Informar o CPF do beneficiário.
       *
       * <p>Validação: Deve ser o mesmo CPF informado no evento de remuneração ou desligamento
       * (S-1200, S-1202, S-1207, S-2299 ou S-2399).
       *
       * @param cpfBenef Valor para atribuir ao campo cpfBenef
       * @return O próprio IdeBenef para continuar populando outros campos
       */
      public IdeBenef<T> setCpfBenef(String cpfBenef) {
        this.cpfBenef = cpfBenef;
        return this;
      }

      /**
       * Informações dos pagamentos efetuados.
       *
       * @return Conteúdo do campo infoPgto
       */
      public java.util.List<InfoPgto> getInfoPgto() {
        return this.infoPgto;
      }

      /**
       * Informações dos pagamentos efetuados.
       *
       * <p>- Esse campo pode ser repetido até 999 vezes
       *
       * <p>CHAVE_GRUPO: {tpPgto}, {perRef}, {ideDmDev}
       *
       * @return O objeto InfoPgto para população dos campos filhos
       */
      public InfoPgto<IdeBenef<T>> setInfoPgto_Next() {
        if (this.infoPgto == null) {
          this.infoPgto = new java.util.ArrayList<>();
        }
        InfoPgto toAdd = new InfoPgto(this);
        this.infoPgto.add(toAdd);
        return toAdd;
      }

      public IdeBenef(Object pai) {
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
       * Informações dos pagamentos efetuados.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtPgto",
            "tpPgto",
            "perRef",
            "ideDmDev",
            "vrLiq",
          })
      public static class InfoPgto<T> {

        /** Informar a data de pagamento. */
        private javax.xml.datatype.XMLGregorianCalendar dtPgto;

        /** Informar o evento de origem do pagamento. */
        private String tpPgto;

        /**
         * Informar a competência declarada no campo {perApur} do evento remuneratório a que se
         * refere o pagamento, no formato AAAA-MM (ou AAAA, se for relativa à folha de 13° salário).
         * Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [2, 3], informar o mês/ano da data de
         * desligamento (ou de término), no formato AAAA-MM.
         */
        private String perRef;

        /**
         * Identificador atribuído pela fonte pagadora para o demonstrativo de valores devidos ao
         * trabalhador conforme definido em S-1200, S-1202, S-1207, S-2299 ou S-2399.
         */
        private String ideDmDev;

        /**
         * Valor líquido recebido pelo trabalhador, composto pelos vencimentos e descontos,
         * inclusive os descontos de IRRF e de pensão alimentícia (se houver).
         */
        private Double vrLiq;

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
         * <p>Validação: A data informada deve estar compreendida no período de apuração
         * ({perApur}(1210_ideEvento_perApur)), exceto se {procEmi}(1210_ideEvento_procEmi) = [2, 4,
         * 22].
         *
         * @param dtPgto Valor para atribuir ao campo dtPgto
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setDtPgto(javax.xml.datatype.XMLGregorianCalendar dtPgto) {
          this.dtPgto = dtPgto;
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
         * @param tpPgto Valor para atribuir ao campo tpPgto
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setTpPgto(String tpPgto) {
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
         * Pagamento de remuneração, conforme apurado em {ideDmDev}(1200_dmDev_ideDmDev) do S-1200
         *
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setTpPgto_1() {
          this.tpPgto = "1";
          return this;
        }
        /**
         * Pagamento de verbas rescisórias conforme apurado em
         * {ideDmDev}(2299_infoDeslig_verbasResc_dmDev_ideDmDev) do S-2299
         *
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setTpPgto_2() {
          this.tpPgto = "2";
          return this;
        }
        /**
         * Pagamento de verbas rescisórias conforme apurado em
         * {ideDmDev}(2399_infoTSVTermino_verbasResc_dmDev_ideDmDev) do S-2399
         *
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setTpPgto_3() {
          this.tpPgto = "3";
          return this;
        }
        /**
         * Pagamento de remuneração conforme apurado em {ideDmDev}(1202_dmDev_ideDmDev) do S-1202
         *
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setTpPgto_4() {
          this.tpPgto = "4";
          return this;
        }
        /**
         * Pagamento de benefícios previdenciários, conforme apurado em
         * {ideDmDev}(1207_dmDev_ideDmDev) do S-1207
         *
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setTpPgto_5() {
          this.tpPgto = "5";
          return this;
        }

        /**
         * Informar a competência declarada no campo {perApur} do evento remuneratório a que se
         * refere o pagamento, no formato AAAA-MM (ou AAAA, se for relativa à folha de 13° salário).
         * Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [2, 3], informar o mês/ano da data de
         * desligamento (ou de término), no formato AAAA-MM.
         *
         * @return Conteúdo do campo perRef
         */
        public String getPerRef() {
          return this.perRef;
        }

        /**
         * Informar a competência declarada no campo {perApur} do evento remuneratório a que se
         * refere o pagamento, no formato AAAA-MM (ou AAAA, se for relativa à folha de 13° salário).
         * Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [2, 3], informar o mês/ano da data de
         * desligamento (ou de término), no formato AAAA-MM.
         *
         * <p>Validação: Deve corresponder ao conteúdo indicado na relação a seguir:
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [1], {perApur}(1200_ideEvento_perApur) do
         * S-1200;
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [2], mês/ano de
         * {dtDeslig}(2299_infoDeslig_dtDeslig) do S-2299 (formato AAAA-MM);
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [3], mês/ano de
         * {dtTerm}(2399_infoTSVTermino_dtTerm) do S-2399 (formato AAAA-MM);
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [4], {perApur}(1202_ideEvento_perApur) do
         * S-1202;
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [5], {perApur}(1207_ideEvento_perApur) do
         * S-1207.
         *
         * @param perRef Valor para atribuir ao campo perRef
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setPerRef(String perRef) {
          this.perRef = perRef;
          return this;
        }

        /**
         * Identificador atribuído pela fonte pagadora para o demonstrativo de valores devidos ao
         * trabalhador conforme definido em S-1200, S-1202, S-1207, S-2299 ou S-2399.
         *
         * @return Conteúdo do campo ideDmDev
         */
        public String getIdeDmDev() {
          return this.ideDmDev;
        }

        /**
         * Identificador atribuído pela fonte pagadora para o demonstrativo de valores devidos ao
         * trabalhador conforme definido em S-1200, S-1202, S-1207, S-2299 ou S-2399.
         *
         * <p>Validação: Deve ser um valor atribuído pela fonte pagadora em S-1200, S-1202, S-1207,
         * S-2299 ou S-2399 no campo {ideDmDev}, obedecendo à relação:
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [1], em S-1200;
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [2], em S-2299;
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [3], em S-2399;
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [4], em S-1202;
         *
         * <p>Se {tpPgto}(1210_ideBenef_infoPgto_tpPgto) = [5], em S-1207.
         *
         * @param ideDmDev Valor para atribuir ao campo ideDmDev
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setIdeDmDev(String ideDmDev) {
          this.ideDmDev = ideDmDev;
          return this;
        }

        /**
         * Valor líquido recebido pelo trabalhador, composto pelos vencimentos e descontos,
         * inclusive os descontos de IRRF e de pensão alimentícia (se houver).
         *
         * @return Conteúdo do campo vrLiq
         */
        public Double getVrLiq() {
          return this.vrLiq;
        }

        /**
         * Valor líquido recebido pelo trabalhador, composto pelos vencimentos e descontos,
         * inclusive os descontos de IRRF e de pensão alimentícia (se houver).
         *
         * <p>Validação: Não pode ser um valor negativo.
         *
         * @param vrLiq Valor para atribuir ao campo vrLiq
         * @return O próprio InfoPgto para continuar populando outros campos
         */
        public InfoPgto<T> setVrLiq(Double vrLiq) {
          this.vrLiq = vrLiq;
          return this;
        }

        public InfoPgto(Object pai) {
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
