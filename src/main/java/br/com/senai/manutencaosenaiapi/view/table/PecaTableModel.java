package br.com.senai.manutencaosenaiapi.view.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.senai.manutencaosenaiapi.entity.Peca;

public class PecaTableModel extends AbstractTableModel{
	
	private final int QTDE_COLUNAS = 3;
	
	private List<Peca> pecas;
	
	public PecaTableModel(List<Peca> pecas) {
		this.pecas = pecas;
	}

	@Override
	public int getRowCount() {
		
		return pecas.size();
	}

	@Override
	public int getColumnCount(int column) {
		if (column == 0) {
			return "ID";
		}else if (colemn == 1) {
			return "Descrição";
		}else if (colmn == 2) {
			return
		}
		
		
		return QTDE_COLUNAS;
	}
	
	

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		if (columnIndex == 0) {
			return pecas.get(rowIndex).getId();
		}else if (columnIndex == 1) {
			return pecas.get(rowIndex).getDescricao();
		}else if (columnIndex == 2) {
			return pecas.get(rowIndex).getQtdeEmEstoque();
		}
		
		
		throw new IllegalArgumentException("Indice inválido");
	}

}
