package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1280 - Informações Complementares aos Eventos Periódicos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtInfoComplPer",
    })
@XmlRootElement(name = "eSocial")
public class Evento_InfoComplPer {

  /** Evento Informações Complementares */
  private EvtInfoComplPer evtInfoComplPer;

  /**
   * Evento Informações Complementares
   *
   * @return Conteúdo do campo evtInfoComplPer
   */
  public EvtInfoComplPer getEvtInfoComplPer() {
    return this.evtInfoComplPer;
  }

  /**
   * Evento Informações Complementares
   *
   * <p>DESCRICAO_COMPLETA:Evento Informações Complementares aos Eventos Periódicos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVE_FOPAG_IND_RETIFICACAO
   *
   * <p>REGRA:REGRA_EVE_FOPAG_INFO_COMPAT_CLASSTRIB
   *
   * <p>REGRA:REGRA_EVE_FOPAG_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_EVE_FOPAG_SIMPLIFICADO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_REMUN_ANUAL_DEZEMBRO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * @return O objeto EvtInfoComplPer para população dos campos filhos
   */
  public EvtInfoComplPer<Evento_InfoComplPer> setEvtInfoComplPer() {
    if (this.evtInfoComplPer == null) {
      this.evtInfoComplPer = new EvtInfoComplPer(this);
    }
    return this.evtInfoComplPer;
  }

  /**
   * Evento Informações Complementares
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoSubstPatr",
        "infoSubstPatrOpPort",
        "infoAtivConcom",
      })
  public static class EvtInfoComplPer<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Inf. complementares - Empresas enquadradas nos arts. 7º a 9º da Lei 12.546/2011 */
    private InfoSubstPatr infoSubstPatr;

    /**
     * Informação de substituição prevista na Lei 12.546/2011
     *
     * <p>- Esse campo pode ser repetido até 9.999 vezes
     */
    private java.util.List<InfoSubstPatrOpPort> infoSubstPatrOpPort;

    /** Empresas enquadradas no Simples Nacional - Atividades concomitantes */
    private InfoAtivConcom infoAtivConcom;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_folha getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}
     *
     * @return O objeto Tipos.T_ideEvento_folha para população dos campos filhos
     */
    public Tipos.T_ideEvento_folha<EvtInfoComplPer<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_folha(this);
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
    public Tipos.T_ideEmpregador<EvtInfoComplPer<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Inf. complementares - Empresas enquadradas nos arts. 7º a 9º da Lei 12.546/2011
     *
     * @return Conteúdo do campo infoSubstPatr
     */
    public InfoSubstPatr getInfoSubstPatr() {
      return this.infoSubstPatr;
    }

    /**
     * Inf. complementares - Empresas enquadradas nos arts. 7º a 9º da Lei 12.546/2011
     *
     * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente por empresa enquadrada nos arts. 7º a
     * 9º da Lei 12.546/2011, conforme classificação tributária indicada no evento S-1000.
     *
     * <p>CONDICAO_GRUPO: O (se {indDesFolha}(1000_infoEmpregador_inclusao_infoCadastro_indDesFolha)
     * em S-1000 = [1]); N (nos demais casos)
     *
     * @return O objeto InfoSubstPatr para população dos campos filhos
     */
    public InfoSubstPatr<EvtInfoComplPer<T>> setInfoSubstPatr() {
      if (this.infoSubstPatr == null) {
        this.infoSubstPatr = new InfoSubstPatr(this);
      }
      return this.infoSubstPatr;
    }

    /**
     * Informação de substituição prevista na Lei 12.546/2011
     *
     * @return Conteúdo do campo infoSubstPatrOpPort
     */
    public java.util.List<InfoSubstPatrOpPort> getInfoSubstPatrOpPort() {
      return this.infoSubstPatrOpPort;
    }

    /**
     * Informação de substituição prevista na Lei 12.546/2011
     *
     * <p>- Esse campo pode ser repetido até 9.999 vezes
     *
     * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente pelo Órgão Gestor de Mão de Obra - OGMO
     * ({classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [09]), listando
     * apenas seus códigos de lotação com operadores portuários enquadrados nos arts. 7º a 9º da Lei
     * 12.546/2011.
     *
     * <p>CHAVE_GRUPO: {codLotacao}
     *
     * <p>CONDICAO_GRUPO: OC (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em
     * S-1000 = [09]; N (nos demais casos)
     *
     * @return O objeto InfoSubstPatrOpPort para população dos campos filhos
     */
    public InfoSubstPatrOpPort<EvtInfoComplPer<T>> setInfoSubstPatrOpPort_Next() {
      if (this.infoSubstPatrOpPort == null) {
        this.infoSubstPatrOpPort = new java.util.ArrayList<>();
      }
      InfoSubstPatrOpPort toAdd = new InfoSubstPatrOpPort(this);
      this.infoSubstPatrOpPort.add(toAdd);
      return toAdd;
    }

    /**
     * Empresas enquadradas no Simples Nacional - Atividades concomitantes
     *
     * @return Conteúdo do campo infoAtivConcom
     */
    public InfoAtivConcom getInfoAtivConcom() {
      return this.infoAtivConcom;
    }

    /**
     * Empresas enquadradas no Simples Nacional - Atividades concomitantes
     *
     * <p>DESCRICAO_COMPLETA:Grupo preenchido por empresa enquadrada no regime de tributação Simples
     * Nacional com tributação previdenciária substituída e não substituída.
     *
     * <p>CONDICAO_GRUPO: O (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em
     * S-1000 = [03]); N (nos demais casos)
     *
     * @return O objeto InfoAtivConcom para população dos campos filhos
     */
    public InfoAtivConcom<EvtInfoComplPer<T>> setInfoAtivConcom() {
      if (this.infoAtivConcom == null) {
        this.infoAtivConcom = new InfoAtivConcom(this);
      }
      return this.infoAtivConcom;
    }

    public EvtInfoComplPer(Object pai) {
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
     * Inf. complementares - Empresas enquadradas nos arts. 7º a 9º da Lei 12.546/2011
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "indSubstPatr",
          "percRedContrib",
        })
    public static class InfoSubstPatr<T> {

      /** Indicativo de substituição da contribuição previdenciária patronal. */
      private String indSubstPatr;

      /** Percentual não substituído pela contribuição prevista na Lei 12.546/2011. */
      private Double percRedContrib;

      /**
       * Indicativo de substituição da contribuição previdenciária patronal.
       *
       * @return Conteúdo do campo indSubstPatr
       */
      public String getIndSubstPatr() {
        return this.indSubstPatr;
      }

      /**
       * Indicativo de substituição da contribuição previdenciária patronal.
       *
       * @param indSubstPatr Valor para atribuir ao campo indSubstPatr
       * @return O próprio InfoSubstPatr para continuar populando outros campos
       */
      public InfoSubstPatr<T> setIndSubstPatr(String indSubstPatr) {
        if (!"1".equals(indSubstPatr) && !"2".equals(indSubstPatr))
          throw new RuntimeException(
              "Valor " + String.valueOf(indSubstPatr) + " inválido para o campo indSubstPatr");
        this.indSubstPatr = indSubstPatr;
        return this;
      }
      /**
       * Integralmente substituída
       *
       * @return O próprio InfoSubstPatr para continuar populando outros campos
       */
      public InfoSubstPatr<T> setIndSubstPatr_1() {
        this.indSubstPatr = "1";
        return this;
      }
      /**
       * Parcialmente substituída
       *
       * @return O próprio InfoSubstPatr para continuar populando outros campos
       */
      public InfoSubstPatr<T> setIndSubstPatr_2() {
        this.indSubstPatr = "2";
        return this;
      }

      /**
       * Percentual não substituído pela contribuição prevista na Lei 12.546/2011.
       *
       * @return Conteúdo do campo percRedContrib
       */
      public Double getPercRedContrib() {
        return this.percRedContrib;
      }

      /**
       * Percentual não substituído pela contribuição prevista na Lei 12.546/2011.
       *
       * <p>Informar 0 (zero) se {indSubstPatr}(./indSubstPatr) = [1]. Caso contrário, preencher com
       * o percentual correspondente à razão entre a receita de atividades não relacionadas nos
       * arts. 7º e 8º da Lei 12.546/2011 e a receita bruta total.
       *
       * <p>Validação: Se {indSubstPatr}(./indSubstPatr) = [1], informar 0 (zero).
       *
       * @param percRedContrib Valor para atribuir ao campo percRedContrib
       * @return O próprio InfoSubstPatr para continuar populando outros campos
       */
      public InfoSubstPatr<T> setPercRedContrib(Double percRedContrib) {
        this.percRedContrib = percRedContrib;
        return this;
      }

      public InfoSubstPatr(Object pai) {
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
     * Informação de substituição prevista na Lei 12.546/2011
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "codLotacao",
        })
    public static class InfoSubstPatrOpPort<T> {

      /** Informar o código atribuído pelo empregador para a lotação tributária. */
      private String codLotacao;

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
       * <p>Validação: Deve ser um código válido e existente na Tabela de Lotações Tributárias
       * (S-1020), com {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao) = [08].
       *
       * @param codLotacao Valor para atribuir ao campo codLotacao
       * @return O próprio InfoSubstPatrOpPort para continuar populando outros campos
       */
      public InfoSubstPatrOpPort<T> setCodLotacao(String codLotacao) {
        this.codLotacao = codLotacao;
        return this;
      }

      public InfoSubstPatrOpPort(Object pai) {
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
     * Empresas enquadradas no Simples Nacional - Atividades concomitantes
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "fatorMes",
          "fator13",
        })
    public static class InfoAtivConcom<T> {

      /**
       * Informe o fator a ser utilizado para cálculo da contribuição patronal do mês dos
       * trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em conjunto com
       * as dos Anexos I a III e V da Lei Complementar 123/2006.
       */
      private Double fatorMes;

      /**
       * Informe o fator a ser utilizado para cálculo da contribuição patronal do décimo terceiro
       * dos trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em conjunto
       * com as dos Anexos I a III e V da Lei Complementar 123/2006.
       */
      private Double fator13;

      /**
       * Informe o fator a ser utilizado para cálculo da contribuição patronal do mês dos
       * trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em conjunto com
       * as dos Anexos I a III e V da Lei Complementar 123/2006.
       *
       * @return Conteúdo do campo fatorMes
       */
      public Double getFatorMes() {
        return this.fatorMes;
      }

      /**
       * Informe o fator a ser utilizado para cálculo da contribuição patronal do mês dos
       * trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em conjunto com
       * as dos Anexos I a III e V da Lei Complementar 123/2006.
       *
       * @param fatorMes Valor para atribuir ao campo fatorMes
       * @return O próprio InfoAtivConcom para continuar populando outros campos
       */
      public InfoAtivConcom<T> setFatorMes(Double fatorMes) {
        this.fatorMes = fatorMes;
        return this;
      }

      /**
       * Informe o fator a ser utilizado para cálculo da contribuição patronal do décimo terceiro
       * dos trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em conjunto
       * com as dos Anexos I a III e V da Lei Complementar 123/2006.
       *
       * @return Conteúdo do campo fator13
       */
      public Double getFator13() {
        return this.fator13;
      }

      /**
       * Informe o fator a ser utilizado para cálculo da contribuição patronal do décimo terceiro
       * dos trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em conjunto
       * com as dos Anexos I a III e V da Lei Complementar 123/2006.
       *
       * @param fator13 Valor para atribuir ao campo fator13
       * @return O próprio InfoAtivConcom para continuar populando outros campos
       */
      public InfoAtivConcom<T> setFator13(Double fator13) {
        this.fator13 = fator13;
        return this;
      }

      public InfoAtivConcom(Object pai) {
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
