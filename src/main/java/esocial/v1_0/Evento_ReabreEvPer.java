package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1298 - Reabertura dos Eventos Periódicos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtReabreEvPer",
    })
@XmlRootElement(name = "eSocial")
public class Evento_ReabreEvPer {

  /** Evento Reabertura dos Eventos Periódicos. */
  private EvtReabreEvPer evtReabreEvPer;

  /**
   * Evento Reabertura dos Eventos Periódicos.
   *
   * @return Conteúdo do campo evtReabreEvPer
   */
  public EvtReabreEvPer getEvtReabreEvPer() {
    return this.evtReabreEvPer;
  }

  /**
   * Evento Reabertura dos Eventos Periódicos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVE_FOPAG_SIMPLIFICADO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_REABERTURA_VALIDA_PERIODO_APURACAO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * @return O objeto EvtReabreEvPer para população dos campos filhos
   */
  public EvtReabreEvPer<Evento_ReabreEvPer> setEvtReabreEvPer() {
    if (this.evtReabreEvPer == null) {
      this.evtReabreEvPer = new EvtReabreEvPer(this);
    }
    return this.evtReabreEvPer;
  }

  /**
   * Evento Reabertura dos Eventos Periódicos.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
      })
  public static class EvtReabreEvPer<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha_sem_retificacao ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_folha_sem_retificacao getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}
     *
     * @return O objeto Tipos.T_ideEvento_folha_sem_retificacao para população dos campos filhos
     */
    public Tipos.T_ideEvento_folha_sem_retificacao<EvtReabreEvPer<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_folha_sem_retificacao(this);
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
    public Tipos.T_ideEmpregador<EvtReabreEvPer<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    public EvtReabreEvPer(Object pai) {
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
