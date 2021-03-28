package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2420 - Cadastro de Benefício - Entes Públicos - Término */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCdBenTerm",
    })
@XmlRootElement(name = "eSocial")
public class Evento_CdBenTerm {

  /** Evento Cadastro de Benefício - Término */
  private EvtCdBenTerm evtCdBenTerm;

  /**
   * Evento Cadastro de Benefício - Término
   *
   * @return Conteúdo do campo evtCdBenTerm
   */
  public EvtCdBenTerm getEvtCdBenTerm() {
    return this.evtCdBenTerm;
  }

  /**
   * Evento Cadastro de Benefício - Término
   *
   * <p>DESCRICAO_COMPLETA:Evento Cadastro de Benefício - Entes Públicos - Término.
   *
   * <p>CHAVE_GRUPO: {Id}
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
   * <p>REGRA:REGRA_MUDANCA_CPF
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_BENEFICIO
   *
   * <p>REGRA:REGRA_VALIDA_CNPJ
   *
   * @return O objeto EvtCdBenTerm para população dos campos filhos
   */
  public EvtCdBenTerm<Evento_CdBenTerm> setEvtCdBenTerm() {
    if (this.evtCdBenTerm == null) {
      this.evtCdBenTerm = new EvtCdBenTerm(this);
    }
    return this.evtCdBenTerm;
  }

  /**
   * Evento Cadastro de Benefício - Término
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
        "infoBenTermino",
      })
  public static class EvtCdBenTerm<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

    /** Identificação do beneficiário e do benefício. */
    private Tipos.T_ideBeneficio ideBeneficio;

    /** Informações da cessação do benefício. */
    private InfoBenTermino infoBenTermino;

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
    public Tipos.T_ideEvento_trab<EvtCdBenTerm<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador_cnpj<EvtCdBenTerm<T>> setIdeEmpregador() {
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
    public Tipos.T_ideBeneficio<EvtCdBenTerm<T>> setIdeBeneficio() {
      if (this.ideBeneficio == null) {
        this.ideBeneficio = new Tipos.T_ideBeneficio(this);
      }
      return this.ideBeneficio;
    }

    /**
     * Informações da cessação do benefício.
     *
     * @return Conteúdo do campo infoBenTermino
     */
    public InfoBenTermino getInfoBenTermino() {
      return this.infoBenTermino;
    }

    /**
     * Informações da cessação do benefício.
     *
     * <p>CHAVE_GRUPO: {dtTermBeneficio}
     *
     * @return O objeto InfoBenTermino para população dos campos filhos
     */
    public InfoBenTermino<EvtCdBenTerm<T>> setInfoBenTermino() {
      if (this.infoBenTermino == null) {
        this.infoBenTermino = new InfoBenTermino(this);
      }
      return this.infoBenTermino;
    }

    public EvtCdBenTerm(Object pai) {
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
     * Informações da cessação do benefício.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtTermBeneficio",
          "mtvTermino",
          "cnpjOrgaoSuc",
          "novoCPF",
        })
    public static class InfoBenTermino<T> {

      /** Data de cessação do benefício. */
      private javax.xml.datatype.XMLGregorianCalendar dtTermBeneficio;

      /** Motivo da cessação do benefício. */
      private String mtvTermino;

      /** Informar o CNPJ do órgão público sucessor. */
      private String cnpjOrgaoSuc;

      /** Preencher com o novo CPF do beneficiário. */
      private String novoCPF;

      /**
       * Data de cessação do benefício.
       *
       * @return Conteúdo do campo dtTermBeneficio
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtTermBeneficio() {
        return this.dtTermBeneficio;
      }

      /**
       * Data de cessação do benefício.
       *
       * <p>Validação: Deve ser igual ou anterior à data atual. No caso de benefício reativado,
       * também deve ser uma data igual ou posterior a {dtEfetReativ}(2418_infoReativ_dtEfetReativ)
       * do evento S-2418.
       *
       * @param dtTermBeneficio Valor para atribuir ao campo dtTermBeneficio
       * @return O próprio InfoBenTermino para continuar populando outros campos
       */
      public InfoBenTermino<T> setDtTermBeneficio(
          javax.xml.datatype.XMLGregorianCalendar dtTermBeneficio) {
        this.dtTermBeneficio = dtTermBeneficio;
        return this;
      }

      /**
       * Motivo da cessação do benefício.
       *
       * @return Conteúdo do campo mtvTermino
       */
      public String getMtvTermino() {
        return this.mtvTermino;
      }

      /**
       * Motivo da cessação do benefício.
       *
       * <p>Validação: Deve ser um código válido e existente na Tabela 26.
       *
       * @param mtvTermino Valor para atribuir ao campo mtvTermino
       * @return O próprio InfoBenTermino para continuar populando outros campos
       */
      public InfoBenTermino<T> setMtvTermino(String mtvTermino) {
        this.mtvTermino = mtvTermino;
        return this;
      }

      /**
       * Informar o CNPJ do órgão público sucessor.
       *
       * @return Conteúdo do campo cnpjOrgaoSuc
       */
      public String getCnpjOrgaoSuc() {
        return this.cnpjOrgaoSuc;
      }

      /**
       * Informar o CNPJ do órgão público sucessor.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se {mtvTermino}(./mtvTermino) = [09].
       *
       * <p>Deve ser um CNPJ válido e diferente da inscrição do declarante, considerando as
       * particularidades aplicadas à informação de CNPJ de órgão público em S-1000. Além disso,
       * deve possuir 14 (catorze) algarismos e ser diferente do CNPJ base do órgão público
       * declarante (exceto se {ideEmpregador/nrInsc}(2420_ideEmpregador_nrInsc) tiver 14 (catorze)
       * algarismos) e dos estabelecimentos informados através do evento S-1005.
       *
       * @param cnpjOrgaoSuc Valor para atribuir ao campo cnpjOrgaoSuc
       * @return O próprio InfoBenTermino para continuar populando outros campos
       */
      public InfoBenTermino<T> setCnpjOrgaoSuc(String cnpjOrgaoSuc) {
        this.cnpjOrgaoSuc = cnpjOrgaoSuc;
        return this;
      }

      /**
       * Preencher com o novo CPF do beneficiário.
       *
       * @return Conteúdo do campo novoCPF
       */
      public String getNovoCPF() {
        return this.novoCPF;
      }

      /**
       * Preencher com o novo CPF do beneficiário.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se {mtvTermino}(./mtvTermino) = [10].
       *
       * <p>Deve ser um CPF válido e diferente do antigo CPF do beneficiário.
       *
       * @param novoCPF Valor para atribuir ao campo novoCPF
       * @return O próprio InfoBenTermino para continuar populando outros campos
       */
      public InfoBenTermino<T> setNovoCPF(String novoCPF) {
        this.novoCPF = novoCPF;
        return this;
      }

      public InfoBenTermino(Object pai) {
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
