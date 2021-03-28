package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2418 - Reativação de Benefício - Entes Públicos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtReativBen",
    })
@XmlRootElement(name = "eSocial")
public class Evento_ReativBen {

  /** Evento Reativação de Benefício */
  private EvtReativBen evtReativBen;

  /**
   * Evento Reativação de Benefício
   *
   * @return Conteúdo do campo evtReativBen
   */
  public EvtReativBen getEvtReativBen() {
    return this.evtReativBen;
  }

  /**
   * Evento Reativação de Benefício
   *
   * <p>DESCRICAO_COMPLETA:Evento Reativação de Benefício - Entes Públicos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EXISTE_EVENTO_BENEFICIO_TERMINO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_REATIVACAO
   *
   * <p>REGRA:REGRA_REATIVACAO_EXCLUSAO_EVENTO
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_BENEFICIO
   *
   * <p>REGRA:REGRA_VALIDA_CNPJ
   *
   * @return O objeto EvtReativBen para população dos campos filhos
   */
  public EvtReativBen<Evento_ReativBen> setEvtReativBen() {
    if (this.evtReativBen == null) {
      this.evtReativBen = new EvtReativBen(this);
    }
    return this.evtReativBen;
  }

  /**
   * Evento Reativação de Benefício
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
        "infoReativ",
      })
  public static class EvtReativBen<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

    /** Identificação do beneficiário e do benefício. */
    private Tipos.T_ideBeneficio ideBeneficio;

    /** Informações da reativação do benefício. */
    private InfoReativ infoReativ;

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
    public Tipos.T_ideEvento_trab<EvtReativBen<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador_cnpj<EvtReativBen<T>> setIdeEmpregador() {
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
    public Tipos.T_ideBeneficio<EvtReativBen<T>> setIdeBeneficio() {
      if (this.ideBeneficio == null) {
        this.ideBeneficio = new Tipos.T_ideBeneficio(this);
      }
      return this.ideBeneficio;
    }

    /**
     * Informações da reativação do benefício.
     *
     * @return Conteúdo do campo infoReativ
     */
    public InfoReativ getInfoReativ() {
      return this.infoReativ;
    }

    /**
     * Informações da reativação do benefício.
     *
     * <p>CHAVE_GRUPO: {dtEfetReativ}
     *
     * @return O objeto InfoReativ para população dos campos filhos
     */
    public InfoReativ<EvtReativBen<T>> setInfoReativ() {
      if (this.infoReativ == null) {
        this.infoReativ = new InfoReativ(this);
      }
      return this.infoReativ;
    }

    public EvtReativBen(Object pai) {
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
     * Informações da reativação do benefício.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtEfetReativ",
          "dtEfeito",
        })
    public static class InfoReativ<T> {

      /** Informar a data da efetiva reativação do benefício. */
      private javax.xml.datatype.XMLGregorianCalendar dtEfetReativ;

      /** Data de início dos efeitos financeiros da reativação do benefício. */
      private javax.xml.datatype.XMLGregorianCalendar dtEfeito;

      /**
       * Informar a data da efetiva reativação do benefício.
       *
       * @return Conteúdo do campo dtEfetReativ
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtEfetReativ() {
        return this.dtEfetReativ;
      }

      /**
       * Informar a data da efetiva reativação do benefício.
       *
       * <p>Validação: Deve ser posterior à data de cessação do benefício e igual ou anterior à data
       * atual.
       *
       * @param dtEfetReativ Valor para atribuir ao campo dtEfetReativ
       * @return O próprio InfoReativ para continuar populando outros campos
       */
      public InfoReativ<T> setDtEfetReativ(javax.xml.datatype.XMLGregorianCalendar dtEfetReativ) {
        this.dtEfetReativ = dtEfetReativ;
        return this;
      }

      /**
       * Data de início dos efeitos financeiros da reativação do benefício.
       *
       * @return Conteúdo do campo dtEfeito
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtEfeito() {
        return this.dtEfeito;
      }

      /**
       * Data de início dos efeitos financeiros da reativação do benefício.
       *
       * <p>Validação: Deve ser uma data igual ou anterior à data da efetiva reativação do benefício
       * e posterior à data de sua cessação.
       *
       * @param dtEfeito Valor para atribuir ao campo dtEfeito
       * @return O próprio InfoReativ para continuar populando outros campos
       */
      public InfoReativ<T> setDtEfeito(javax.xml.datatype.XMLGregorianCalendar dtEfeito) {
        this.dtEfeito = dtEfeito;
        return this;
      }

      public InfoReativ(Object pai) {
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
